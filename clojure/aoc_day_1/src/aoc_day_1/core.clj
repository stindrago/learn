(ns aoc-day-1.core
  (:gen-class)
  (:require [aoc-day-1.input :refer [moduli]]))

(defn calcola_carburante
  "Calcolo il carburante della massa del modulo"
  [massa]
  (- (int (Math/floor (/ massa 3))) 2))

(defn parte_1
  "Calcolo il carburante totale per la massa dei moduli"
  [massa]
  (reduce + (map calcola_carburante massa)))

(defn parte_2
  [massa]
  (loop [carburante_neccessario (calcola_carburante massa)
         carburante_tot 0]
    (if (< carburante_neccessario 0)
      carburante_tot
      (recur (calcola_carburante carburante_neccessario)
             (+ carburante_tot carburante_neccessario)))))

(defn -main
  []
  (println "Carburante per massa moduli (PUZZLE PARTE 1):" (parte_1 moduli))
  (println "Carburante per massa carburante per massa moduli (PUZZLE PARTE 2):" (reduce + (map parte_2 moduli))))
