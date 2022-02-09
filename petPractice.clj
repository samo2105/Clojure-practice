(ns Clojure-practice.petPractice
  (:gen-class))

(defn -main [&args])

"First practice"
(defn petToHumanAge [pet]
  "This functions return the age convertion"
  (def petStore {'cat 5, 'dog 7, 'fish 10})
  (get petStore pet))

(defn age
  "This function returns the age of the pet"
  [petName petType petAge]
  (def ration (petToHumanAge petType))
  (println petName "is" (* petAge ration) "on human age"))

(age "Parrilla" 'dog 5)