@startuml FactoryMethod

class Scenario {
  +main()
}

abstract class DeliveryMan {
  +getVehicle()
  +deliver()
}
note left 
public deliver(){
  ...
  <b>this.getVehicle();</b>
  ..
}
end note

abstract class Vehicle {

}

class CyclistDeliveryMan {
  +getVehicle()
}
note left 
public getVehicle(){
  <b>return new Bicycle();</b>
}
end note

class MotorcyclistDeliveryMan {
  +getVehicle()
}
note right 
public getVehicle(){
  <b>return new Motorcycle();</b>
}
end note

Scenario  .down.> CyclistDeliveryMan
Scenario  .down.> MotorcyclistDeliveryMan

DeliveryMan  <|-down- CyclistDeliveryMan
DeliveryMan  <|-down- MotorcyclistDeliveryMan

CyclistDeliveryMan .down.> Bicycle
MotorcyclistDeliveryMan .down.> Motorcycle

Scenario .down.> DeliveryMan

DeliveryMan .down.> Vehicle

Vehicle <|-down-Bicycle
Vehicle <|-down-Motorcycle

@enduml