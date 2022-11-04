@startuml AbstractFactory

class Scenario
class Surgeon {
  +operate(InstrumentList)
}
note left 
...
<b>instrumentalist.createCuttingTool();</b>
cuttingTool.cut();
<b>instrumentalist.createDryingTool();</b>
dryingTool.dry();
...
end note

abstract class InstrumentList {
  +createCuttingTool()
  +createDryingTool()
}


Scenario .down.> Surgeon

Surgeon .down.> CuttingTool
Surgeon .down.> DryingTool


Surgeon .down.> InstrumentList
Scenario .down.> InstrumentList

Scenario .down.> InstrumentalistOperationRoom
Scenario .down.> InstrumentalistJungle


abstract class CuttingTool
abstract class DryingTool

CuttingTool <|-down- Scalpel 
CuttingTool <|-down- Knife

DryingTool <|-down- Compress 
DryingTool <|-down- Rag


class InstrumentalistOperationRoom {
  +createCuttingTool()
  +createDryingTool()
}

class InstrumentalistJungle{
  +createCuttingTool()
  +createDryingTool()
}

InstrumentList <|-down- InstrumentalistOperationRoom
InstrumentalistOperationRoom .down.> Scalpel
InstrumentalistOperationRoom .down.> Compress

InstrumentList <|-down- InstrumentalistJungle


InstrumentalistJungle .down.> Knife
InstrumentalistJungle .down.> Rag



@enduml