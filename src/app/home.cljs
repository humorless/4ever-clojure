(ns app.home
  (:require [app.data :as data]
            [app.state :as state :refer [db]]
            [reagent.core :as r]))

(def user-data (r/cursor db [:solutions]))

(def sort-by-solved (r/cursor db [:sort-by-solved]))

(defn sorted-problems []
  (let [data-state
        (map #(assoc % :solution (get @user-data (:id %)))
             data/problems)
        sorted (if (nil? @sort-by-solved)
                 (sort-by :id data-state)
                 (sort-by :solution #(not (nil? %)) data-state))]
    (if (false? @sort-by-solved) (reverse sorted) sorted)))

(defn get-problem-status [id]
  (let [{:keys [passed failed]}
        (get @user-data (js/parseInt id))
        progress (str passed "/" (+ passed failed))]
    (cond
      (and passed (zero? failed))
      [:span {:style {:color "green"}} (str progress " Passed!")]
      (not (nil? passed)) progress
      :else "-")))

(defn problem-list-item [{:keys [id title _tags difficulty]}]
  [:tr
   [:td id]
   [:td
    [:a {:href (state/href :problem/item {:id id})}
     title]]
   [:td difficulty]
   [:td (get-problem-status id)]])

(defn problem-list []
  [:<>
   [:h3 "Problems "
    [:small (str "(" (count data/problems) ")")]]
   (into [:table
          [:thead
           [:tr
            [:th {:on-click #(swap! sort-by-solved (fn [] nil))} "No."]
            [:th "Name"]
            [:th "Difficulty"]
            [:th
             {:on-click #(swap! sort-by-solved not)}
             (str "Status  " (case @sort-by-solved
                               true "🠕" false "🠗" nil ""))]]]
          [:tbody
           (for [problem (sorted-problems)]
             ^{:key (:id problem)}
             [problem-list-item problem])]])])

(defn view []
  [:div
   [:h2 "Rationale: Why another 4clojure website?"]
   [:p
    "According to Josh Kaufman, it is possible to acquire a new skill within the 
    first 20 hours. However, if I let ordinary people use the original 4clojure
    website to start, many of them still need some help to overcome certain bottlenecks.
    That is why I built this. All the problems are deliberately designed to ensure 
    that ordinary people can learn some Clojure knowledge here in their first 20 
    hours of Clojure practice."]
   [:p
    "Please note that this website is evaluated completely in the browser. So
    not all Java interop works, but some of it is the same in JS if you're
    lucky. Check "
    [:a {:href "https://cljs.info/cheatsheet/"} "cljs-cheatsheet"]
    " for more info!"]
   [problem-list]])
