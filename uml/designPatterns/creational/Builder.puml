@startuml Builder

class Scenario {
  +main()
}

class Person {
  +eat(Chef)
}
note right 
public eat(Chef){
...
<b>chef.prepareStarter();</b>
<b>chef.prepareMainCourse();</b>
<b>chef.prepareDessert();</b>
...
}
end note


Scenario .down.> Person

Scenario .down.> BasicChef
Scenario .down.> GourmetChef

Person .down.> Chef
Person .down.> Dish

abstract class Chef{
  +prepareStarter()
  +prepareMainCourse()
  +prepareDessert()
}


class BasicChef{
  +prepareStarter()
  +prepareMainCourse()
  +prepareDessert()
}

class GourmetChef{
  +prepareStarter()
  +prepareMainCourse()
  +prepareDessert()
}


Chef <|-down-BasicChef
Chef <|-down-GourmetChef

abstract class Dish
Dish <|-down-Salad
Dish <|-down-Chicken
Dish <|-down-Custard
Dish <|-down-Oyster
Dish <|-down-Sirloin
Dish <|-down-Soufle

Chef .down.> Dish

BasicChef .down.>Dish
GourmetChef .down.>Dish


BasicChef .down->Salad
BasicChef .down->Chicken
BasicChef .down->Custard

GourmetChef .down->Oyster
GourmetChef .down->Sirloin
GourmetChef .down->Soufle

@enduml