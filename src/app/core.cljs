(ns app.core
  (:require [app.routes :as routes]
            [reagent.dom :as rdom]
            [reitit.frontend.easy :as rfe]))

(def notification
  [:div {:style {:background-color "#D6D0FD"
                 :position "absolute"
                 :top 0
                 :left 0
                 :width "100%"
                 :text-align "center"}}
   [:div {:style {:padding "0.5rem"}}
    [:small
     "Solutions archive browsable from each problem page 🎉 Huge thanks to Alan!!"]]])

(defn header []
  [:header
   [:h1 "20 hours Clojure"]
   [:p
    [:small
     [:a {:href (rfe/href :home)
          :data-reitit-handle-click false} "home"]
     " | "
     [:a {:href "https://github.com/humorless/4ever-clojure"} "github"]
     " | "
     "Built by "
     [:a {:href "https://replware.dev"} "Laurence Chen"]
     [:br]
     "With 99% code reuse from "
     [:a {:href "https://4clojure.oxal.org/"} "4ever-clojure"]]]
   #_notification])

(defn main []
  [:div
   [header]
   (when-let [match @routes/match]
     (let [view (:view (:data match))]
       [view match]))])

(defn ^:dev/after-load mount []
  (rdom/render
   [main]
   (js/document.getElementById "app")))

(defn init! []
  (routes/init!)
  (mount))

(init!)
