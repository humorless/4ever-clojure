(ns app.data)

(def problems-raw
  [{:title       "Nothing but the Truth"
    :tests       ["(= __ true)"]
    :description "Complete the expression so
it will evaluate to true."
    :difficulty "elementary"
    :tags []}

   {:title       "Simple Math"
    :tests       ["(= (- 10 (* 2 3)) __)"]
    :description "Innermost forms are evaluated first."
    :difficulty "elementary"
    :tags []}

   {:title       "Strings"
    :tests       ["(= __ (.toUpperCase \"hello world\"))"]
    :description "Clojure strings are Java strings,
so you can use Java string methods on them."
    :difficulty "elementary"
    :tags []}

   {:title       "Evaluation"
    :tests       ["(= __ (* 2 3 4 5 6 7 8 9))"]
    :description "Practice: 
                  Copy the form `(* 2 3 4 ...)` into the blank,
                  place the cursor right after the `)` 
                  and press `Alt + Enter` to evaluate the form to get the answer."
    :difficulty "elementary"
    :tags []}

   {:title       "Lists"
    :tests       ["(= (list __) '(:a :b :c))"]
    :description "Lists can be constructed with either
a function or a quoted form."
    :difficulty "elementary"
    :tags []}

   {:title       "conj on lists"
    :tests       ["(= __ (conj '(2 3 4) 1))"
                  "(= __ (conj '(3 4) 2 1))"]
    :description "When operating on a list,
the conj function will return a new list
with one or more items \"added\" to the front."
    :difficulty "elementary"
    :tags []}

   {:title       "Vectors"
    :tests       ["(= [__] (list :a :b :c) (vec '(:a :b :c)) (vector :a :b :c))"]
    :description "Vectors can be constructed several ways.
You can compare them with lists."
    :difficulty "elementary"
    :tags []}

   {:title       "conj on vectors"
    :tests       ["(= __ (conj [1 2 3] 4))"
                  "(= __ (conj [1 2] 3 4))"]
    :description "When operating on a Vector,
the conj function will return a new vector
with one or more items \"added\" to the end."
    :difficulty "elementary"
    :tags []}

   {:title       "Sets"
    :tests       ["(= __ (set '(:a :a :b :c :c :c :c :d :d)))"
                  "(= __ (clojure.set/union #{:a :b :c} #{:b :c :d}))"]
    :description "Sets are collections of unique values."
    :difficulty "elementary"
    :tags []}

   {:title "conj on sets"
    :tests ["(= #{1 2 3 4} (conj #{1 4 3} __))"]
    :description "When operating on a set,
the conj function returns a new set with one or more keys \"added\"."
    :difficulty "elementary"
    :tags []}

   {:title "Maps"
    :tests ["(= __ ((hash-map :a 10, :b 20, :c 30) :b))"
            "(= __ (:b {:a 10, :b 20, :c 30}))"]
    :description "Maps store key-value pairs.
Both maps and keywords can be used as lookup functions.
Commas are whitespace."
    :difficulty "elementary"
    :tags []}

   {:title "conj on maps"
    :tests ["(= {:a 1, :b 2, :c 3} (conj {:a 1} __ [:c 3]))"]
    :description "When operating on a map,
the conj function returns a new map
with one or more key-value pairs \"added\"."
    :difficulty "elementary"
    :tags []}

   {:title       "Sequences: first, second, last"
    :tests       ["(= __ (first '(3 2 1)))"
                  "(= __ (second [2 3 4]))"
                  "(= __ (last (list 1 2 3)))"]
    :description "All Clojure collections support sequencing.
You can operate on sequences with functions
like first, second, and last."
    :difficulty "elementary"
    :tags []}

   {:title       "rest"
    :tests       ["(= __ (rest [10 20 30 40]))"]
    :description "The rest function will return all the items
of a sequence except the first."
    :difficulty "elementary"
    :tags []}

   {:title       "pop from a List"
    :tests       ["(= __ (pop '(3 2 1)))"]
    :description "The pop function removes the first element
from a list."
    :difficulty "elementary"
    :tags []}

   {:title       "pop from a Vector"
    :tests       ["(= __ (pop [4 5 6]))"]
    :description "The pop function removes the last element
from a vector."
    :difficulty "elementary"
    :tags []}

   {:title       "nth Access in Collections"
    :tests       ["(= __ (nth [10 20 30 40 50] 3))"]
    :description "The nth function retrieves an element
at a specific index in a collection."
    :difficulty "elementary"
    :tags []}

   {:title       "get from a Map"
    :tests       ["(= __ (get {:a 10 :b 20 :c 30} :b))"]
    :description "The get function retrieves the value
associated with a given key in a map."
    :difficulty "elementary"
    :tags []}

   {:title       "Associating and Dissociating Keys"
    :tests       ["(= __ (assoc {:a 1} :b 2))"
                  "(= __ (dissoc {:a 1 :b 2 :c 3} :c))"]
    :description "The assoc function adds or updates a key-value pair,
while dissoc removes a key from a map."
    :difficulty "elementary"
    :tags []}

   {:title       "Concatenating Sequences"
    :tests       ["(= __ (concat [1 2] '(3 4)))"]
    :description "The concat function combines multiple sequences
into a single lazy sequence."
    :difficulty "elementary"
    :tags []}

   {:title       "Merge Maps"
    :tests       ["(= __ (merge {:a 1} {:b 2}))"]
    :description "The merge function combines multiple maps into one,
with later maps overriding earlier ones."
    :difficulty "elementary"
    :tags []}

   {:title       "Basic Arithmetic"
    :tests       ["(= __ (inc 5))"
                  "(= __ (dec 7))"
                  "(= __ (max 3 6))"
                  "(= __ (min 6 15))"]
    :description "Arithmetic functions include inc, dec, max, and min."
    :difficulty "elementary"
    :tags []}

   {:title       "Basic Test Functions"
    :tests       ["(= __ (zero? 0))"
                  "(= __ (pos? 5))"
                  "(= __ (number? 42))"
                  "(= __ (nil? nil))"
                  "(= __ (keyword? :kkk))"
                  "(= __ (string? \"hello\"))"]
    :description "Test functions can evaluate properties of values."
    :difficulty "elementary"
    :tags []}
   {:title       "Working with Keywords"
    :tests       ["(= __ (keyword? (keyword \"key\")))"
                  "(= __ (string? (name :key)))"]
    :description "Keywords are immutable and unique identifiers.
They can be converted to strings and strings can also be converted to keyword."
    :difficulty "elementary"
    :tags []}

   {:title       "Strings: Combining and Substrings"
    :tests       ["(= __ (str \"Hello\" \" \" \"World!\"))"
                  "(= __ (subs \"Hello World! Clojure\" 0 12))"
                  "(= __ (clojure.string/trim \"  Hello World!  \"))"]
    :description "The str function concatenates strings,
and subs extracts substrings. The trim function removes whitespace
 from both ends of string."
    :difficulty "elementary"
    :tags []}

   {:title       "String Test Functions"
    :tests       ["(= __ (clojure.string/starts-with? \"hello\" \"he\"))"
                  "(= __ (clojure.string/ends-with? \"hello\" \"llo\"))"
                  "(= __ (clojure.string/includes? \"hello\" \"ll\"))"]
    :description "String functions like starts-with?, ends-with? and includes? are helper to compare substr"
    :difficulty "elementary"
    :tags []}

   {:title       "Collection Predicates"
    :tests       ["(= __ (coll? [1 2 3]))"
                  "(= __ (vector? [1 2 3]))"
                  "(= __ (list? '(1 2 3)))"
                  "(= __ (set? #{1 2 3}))"
                  "(= __ (map? {:a 1 :b 2}))"]
    :description "Use predicates to test the type of a collection."
    :difficulty "elementary"
    :tags []}

   {:title       "Is a collection empty?"
    :tests       ["(= __ (empty? [3 4 5]))"]
    :description "The empty? function checks if a collection is empty."
    :difficulty "elementary"
    :tags []}

   {:title       "How many items are there in a collection?"
    :tests       ["(= __ (count '(1 2 3)))"
                  "(= __ (count [1 2 3]))"
                  "(= __ (count #{:a :b :c}))"
                  "(= __ (count {:a 1 :b 2 :c 3}))"]
    :description "count returns the number of elements."
    :difficulty "elementary"
    :tags []}

   {:title       "Checking Containment in Collections"
    :tests       ["(= __ (contains? #{1 2 3} 2))"
                  "(= __ (contains? {:a 10 :b 20} :a))"
                  "(= __ (contains? {:a nil} :a))"]
    :description "The contains? function checks whether a key
or index exists in a collection."
    :difficulty "elementary"
    :tags []}

   {:title       "Parsing Strings to Long"
    :tests       ["(= __ (clojure.edn/read-string \"123\"))"]
    :description "The clojure.edn/read-string can parse string into Long, Double, or other types"
    :difficulty "elementary"
    :tags []}
    ;; To Here, Estimation of time is 50 minutes
    ;; Conditional 
   {:title       "Logical falsity and truth"
    :description "In Clojure, only nil and false represent the values of logical
falsity in conditional tests - anything else is logical truth."
    :tests       ["(= __ (if-not false 1 0))"
                  "(= __ (if-not nil 1 0))"
                  "(= __ (if true 1 0))"
                  "(= __ (if [] 1 0))"
                  "(= __ (if [0] 1 0))"
                  "(= __ (if 0 1 0))"
                  "(= __ (if 1 1 0))"]
    :difficulty "elementary"
    :tags ["logic"]}

   {:title       "Conditional Logic with if"
    :tests       ["(= __ (if true :true-branch :false-branch))"
                  "(= __ (if false :false-branch :true-branch))"
                  "(= __ (if nil :false-branch :true-branch))"]
    :description "The if function evaluates a condition and returns
one of two branches based on its truthiness."
    :difficulty "elementary"
    :tags []}

   {:title       "Conditional Logic with when"
    :tests       ["(= __ (when true :executed))"
                  "(= __ (when (nil? (when false :not-executed)) :executed))"]
    :description "The when function is like if, but only has a true branch.
It is used for executing expressions conditionally without an else case."
    :difficulty "elementary"
    :tags []}

   {:title       "Local bindings"
    :tests       ["(= __ (let [x 5] (+ 2 x)))"
                  "(= __ (let [x 3, y 10] (- y x)))"
                  "(= __ (let [x 21] (let [y 3] (/ x y))))"]
    :description "Clojure lets you give local names
to values using the special let-form."
    :difficulty "elementary"
    :tags ["syntax"]}
   {:title       "Let it Be"
    :tests       ["(= 10 (let __ (+ x y)))"
                  "(= 4 (let __ (+ y z)))"
                  "(= 1 (let __ z))"]
    :description "Can you bind x, y, and z so that these are all true?"
    :difficulty "elementary"
    :tags ["math" "syntax"]}

   {:title       "Conditional Logic with case"
    :tests       ["(= __ (let [mystr \"no match\"]
        (case mystr
          \"\" 0
          \"hello\" (count mystr)
          \"default\")))"]
    :description "The case function evaluates an expression and
matches it against a set of cases. If no match is found, it returns the final expression."
    :difficulty "elementary"
    :tags []}

   {:title       "Conditional Logic with cond"
    :tests       ["(= __ (let [x 31] 
        (cond
          (= x 10) :ten
          (= x 20) :twenty
          (= x 30) :thirty
          :else :donno)))"]
    :description "The cond function evaluates conditions in order
and returns the value of the first truthy condition.
An :else clause is commonly used as a default."
    :difficulty "elementary"
    :tags []}

   {:title       "Checking Presence with some?"
    :tests       ["(= __ (some? 42))"
                  "(= __ (not (some? nil)))"
                  "(= __ (some? []))"
                  "(= __ (some? {}))"
                  "(= __ (some? '()))"]
    :description "The some? function checks if a value is not nil.
It is similar to not= nil, but more concise."
    :difficulty "elementary"
    :tags []}
   {:title       "Logical Negation with not"
    :tests       ["(= __ (not (not true)))"
                  "(= __ (not false))"
                  "(= __ (not nil))"]
    :description "The not function returns true if its argument is false or nil,
and false otherwise."
    :difficulty "elementary"
    :tags []}

   {:title       "Combining and and or"
    :tests       ["(= __ (and (or false nil 42) false))"
                  "(= \"fallback\" (or (and __ true) \"fallback\"))"]
    :description "You can combine and and or for more complex
logical expressions."
    :difficulty "elementary"
    :tags []}

   {:title       "Short-circuiting with and"
    :tests       ["(= __ (and false (println \"This won't print\")))"]
    :description "The and function stops evaluation as soon as it encounters
a falsey value, making it efficient for conditional checks."
    :difficulty "elementary"
    :tags []}

   {:title       "Short-circuiting with or"
    :tests       ["(= __ (or true (println \"This won't print\")))"]
    :description "The or function stops evaluation as soon as it encounters
a truthy value, skipping subsequent expressions."
    :difficulty "elementary"
    :tags []}

   ;; Functions and control starts here
   {:id         14
    :title       "Functions"
    :tests       ["(= __ ((fn add-five [x] (+ x 5)) 3))"
                  "(= __ ((fn [x] (+ x 5)) 3))"
                  "(= __ (#(+ % 5) 3))"
                  "(= __ ((partial + 5) 3))"]
    :description "Clojure has many different ways to create functions."
    :difficulty "elementary"
    :tags []}
   {:title       "A nil key"
    :description "Write a function which, given a key and map, returns true iff
the map contains an entry with that key and its value is nil."
    :tests       ["(true?  (__ :a {:a nil :b 2}))"
                  "(false? (__ :b {:a nil :b 2}))"
                  "(false? (__ :c {:a nil :b 2}))"]
    :difficulty "elementary"
    :tags ["maps"]}
   {:id         15
    :title       "Double Down"
    :tests       ["(= (__ 2) 4)"
                  "(= (__ 3) 6)"
                  "(= (__ 11) 22)"
                  "(= (__ 7) 14)"]
    :description "Write a function which doubles a number."
    :difficulty "elementary"
    :tags []}

   {:id         16
    :title       "Hello World"
    :tests       ["(= (__ \"Dave\") \"Hello, Dave!\")"
                  "(= (__ \"Jenn\") \"Hello, Jenn!\")"
                  "(= (__ \"Rhea\") \"Hello, Rhea!\")"]
    :description "Write a function which returns a personalized greeting."
    :difficulty "elementary"
    :tags []}

   {:id         17
    :title       "map"
    :tests       ["(= __ (map #(+ % 5) '(1 2 3)))"]
    :description "The map function takes two arguments:
a function (f) and a sequence (s).
Map returns a new sequence consisting of
the result of applying f to each item of s.
Do not confuse the map function with the map data structure."
    :difficulty "elementary"
    :tags []}

   {:id         18
    :title       "filter"
    :tests       ["(= __ (filter #(> % 5) '(3 4 5 6 7)))"]
    :description "The filter function takes two arguments:
a predicate function (f) and a sequence (s).
Filter returns a new sequence consisting
of all the items of s for which (f item) returns true."
    :difficulty "elementary"
    :tags []}
   {:id         64
    :title       "reduce"
    :tests       ["(= 15 (reduce __ [1 2 3 4 5]))"
                  "(=  0 (reduce __ []))"
                  "(=  6 (reduce __ 1 [2 3]))"]
    :description "Reduce takes a 2 argument function
and an optional starting value.
It then applies the function to the first 2 items in the sequence
(or the starting value and the first element of the sequence).
In the next iteration the function will be called on
the previous return value and the next item from the sequence,
thus reducing the entire collection to one value.
Don't worry, it's not as complicated as it sounds."
    :difficulty "elementary"
    :tags ["seqs"]}
   {:id         57
    :title       "Simple Recursion"
    :tests       ["(= __ ((fn foo [x] (when (> x 0) (conj (foo (dec x)) x))) 5))"]
    :description "A recursive function is a function which calls itself.
This is one of the fundamental techniques
used in functional programming."
    :difficulty "elementary"
    :tags ["recursion"]}
   {:id         68
    :title       "Recurring Theme"
    :tests       ["(= __\n  (loop [x 5\n         result []]\n    (if (> x 0)\n      (recur (dec x) (conj result (+ 2 x)))\n      result)))"]
    :description "Clojure only has one
non-stack-consuming looping construct: recur.
Either a function or a loop can be used as the recursion point.
Either way, recur rebinds the bindings
of the recursion point to the values it is passed.
Recur must be called from the tail-position,
and calling it elsewhere will result in an error."
    :difficulty "elementary"
    :tags ["recursion"]}
;; till here. We have basic functions/control structure: local variable, fn, conditionals, recursive, sequence 
   {:id         52
    :title       "Intro to Destructuring"
    :tests       ["(= [2 4] (let [[a b c d e f g] (range)] __))"]
    :description "Let bindings and function parameter lists
support destructuring."
    :difficulty "elementary"
    :tags ["destructuring"]}
   {:id         156
    :title       "Map Defaults"
    :description "When retrieving values from a map, you can specify default
values in case the key is not found:

(= 2 (:foo {:bar 0, :baz 1} 2))

However, what if you want the map itself to contain the default values? Write a
function which takes a default value and a sequence of keys and constructs a map."
    :tests       ["(= (__ 0 [:a :b :c]) {:a 0 :b 0 :c 0})"
                  "(= (__ \"x\" [1 2 3]) {1 \"x\" 2 \"x\" 3 \"x\"})"
                  "(= (__ [:a :b] [:foo :bar]) {:foo [:a :b] :bar [:a :b]})"]
    :difficulty "elementary"
    :tags ["seqs"]}
   {:id         161
    :title       "Subset and Superset"
    :description "Set A is a subset of set B, or equivalently B is a superset of A,
    if A is \"contained\" inside B. A and B may coincide."
    :tests       ["(clojure.set/superset? __ #{2})"
                  "(clojure.set/subset? #{1} __)"
                  "(clojure.set/superset? __ #{1 2})"
                  "(clojure.set/subset? #{1 2} __)"]
    :difficulty "elementary"
    :tags ["set-theory"]}
   {:id         37
    :title       "Regular Expressions"
    :tests       ["(= __ (apply str (re-seq #\"[A-Z]+\" \"bA1B3Ce \")))"]
    :description "Regex patterns are supported with a special reader macro."
    :difficulty "elementary"
    :tags ["regex" "syntax"]}
   {:id         71
    :title       "Rearranging Code: ->"
    :tests       ["(= (__ (sort (rest (reverse [2 5 4 1 3 6]))))\n   (-> [2 5 4 1 3 6] reverse rest sort __)\n   5)"]
    :description "The -> macro threads an expression x through a variable number of forms.
First, x is inserted as the second item in the first form,
making a list of it if it is not a list already.
Then the first form is inserted as the second item in the second form,
making a list of that form if necessary.
This process continues for all the forms.
Using -> can sometimes make your code more readable."
    :difficulty "elementary"
    :tags []}
   {:id         72
    :title       "Rearranging Code: ->>"
    :tests       ["(= (__ (map inc (take 3 (drop 2 [2 5 4 1 3 6]))))\n   (->> [2 5 4 1 3 6] (drop 2) (take 3) (map inc) (__))\n   11)"]
    :description "The ->> macro threads an expression x
through a variable number of forms.
First, x is inserted as the last item in the first form,
making a list of it if it is not a list already.
Then the first form is inserted as the last item in the second form,
making a list of that form if necessary.
This process continues for all the forms.
Using ->> can sometimes make your code more readable."
    :difficulty "elementary"
    :tags []}
   {:id         145
    :title       "For the win"
    :description "Clojure's for macro is a tremendously versatile mechanism for
producing a sequence based on some other sequence(s). It can take some time to
understand how to use it properly, but that investment will be paid back with
clear, concise sequence-wrangling later. With that in mind, read over these for
expressions and try to see how each of them produces the same result."
    :tests       ["(= __ (for [x (range 40)
                               :when (= 1 (rem x 4))]
                           x))"
                  "(= __ (for [x (iterate #(+ 4 %) 0)
                               :let [z (inc x)]
                               :while (< z 40)]
                           z))"
                  "(= __ (for [[x y] (partition 2 (range 20))]
                           (+ x y)))"]
    :difficulty "elementary"
    :tags ["core-functions" "seqs"]}])

(def problems
  (mapv (fn [problem n]
          (assoc problem :id (inc n)))
        problems-raw (range)))
