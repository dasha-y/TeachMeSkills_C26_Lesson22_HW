package by.tms.service;

import by.tms.model.Operation;
import by.tms.storage.InMemoryOperationStorage;

public class OperationService {
    private final InMemoryOperationStorage operationStorage = new InMemoryOperationStorage();
    public Operation calculate(Operation operation){

        switch (operation.getOperation()){
            case "SUM":
                operation.setResult(operation.getNum1() + operation.getNum2());
                operationStorage.save(operation);
                return operation;
            case "MIN":
                operation.setResult(operation.getNum1() - operation.getNum2());
                operationStorage.save(operation);
                return operation;
            case "MULTI":
                operation.setResult(operation.getNum1() * operation.getNum2());
                operationStorage.save(operation);
                return operation;
            case "DIV":
                if(operation.getNum2() !=0){
                operation.setResult(operation.getNum1() / operation.getNum2());
                operationStorage.save(operation);
                return operation;
                } else{
                    throw new IllegalArgumentException();
                }
        }
        throw new IllegalArgumentException();
    }
}
