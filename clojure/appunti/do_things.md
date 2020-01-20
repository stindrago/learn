## do_things

Concatenate strings:
```
(str "It was the panda " "in the library " "with a dust buster")
; => "It was the panda in the library with a dust buster"
```

Boolean expressions:
```
(if boolean-form
  then-form
  optional-else-form)

(if true
  "By Zeus's hammer!"
  "By Aquaman's trident!")
; => "By Zeus's hammer!"

(if false
  "By Zeus's hammer!"
  "By Aquaman's trident!")
; => "By Aquaman's trident!"

(if false
  "By Odin's Elbow!")
; => nil

(if true
  (do (println "Success!")
      "By Zeus's hammer!")
  (do (println "Failure!")
      "By Aquaman's trident!"))
; => Success!
; => "By Zeus's hammer!"
```
```
(when true
  (println "Success!")
  "abra cadabra")
; => Success!
; => "abra cadabra"

```

Truthy and falsey:
```
(nil? 1)
; => false

(nil? nil)
; => true
```
```
(if "bears eat beets"
  "bears beets Battlestar Galactica")
; => "bears beets Battlestar Galactica"

(if nil
  "This won't be the result because nil is falsey"
  "nil is falsey")
; => "nil is falsey"
```

Equality operator:
```
(= 1 1)
; => true

(= nil nil)
; => true

(= 1 2)
; => false
```
`or` returns either the first truthy value or the last value:
```
(or false nil :large_I_mean_venti :why_cant_I_just_say_large)
; => :large_I_mean_venti

(or (= 0 1) (= "yes" "no"))
; => false

(or nil)
; => nil
```

`and` returns the first falsey value or, if no values are falsey, the last truthy value:

```
(and :free_wifi :hot_coffee)
; => :hot_coffee

(and :feelin_super_cool nil false)
; => nil
```

How to define variables (costants):
```
(def failed-protagonist-names
  ["Larry Potter" "Doreen the Explorer" "The Incredible Bulk"])

failed-protagonist-names
; => ["Larry Potter" "Doreen the Explorer" "The Incredible Bulk"]
```

### Data Structures

Numbers:
```
93
1.2
1/5
```

Strings:
```
"Lord Voldemort"
"\"He who must not be named\""
"\"Great cow of Moscow!\" - Hermes Conrad"
```
```
(def name "Chewbacca")
(str "\"Uggllglglglglglglglll\" - " name)
; => "Uggllglglglglglglglll" - Chewbacca
```

Maps:
Empty map:
```
{}
```

Create a map:
```
(hash-map :a 1 :b 2)
; => {:a 1 :b 2}
```

Look inside a map:
```
(get {:a 0 :b 1} :b)
; => 1

(get {:a 0 :b {:c "ho hum"}} :b)
; => {:c "ho hum"}
```
```
(get {:a 0 :b 1} :c)
; => nil

(get {:a 0 :b 1} :c "unicorns?")
; => "unicorns?"
```

Look inside nested maps:
```
(get-in {:a 0 :b {:c "ho hum"}} [:b :c])
; => "ho hum"
```

Treat maps like a function:
```
({:name "The Human Coffeepot"} :name)
; => "The Human Coffeepot"
```

####
Keywards

Provide a default value:
```
(:d {:a 1 :b 2 :c 3} "No gnome knows homes like Noah knows")
; => "No gnome knows homes like Noah knows"
```
