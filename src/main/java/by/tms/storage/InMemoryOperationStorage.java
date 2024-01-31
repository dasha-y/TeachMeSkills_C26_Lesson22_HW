package by.tms.storage;

import by.tms.model.Operation;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class InMemoryOperationStorage {
    private final List<Operation> operations = new ArrayList<>();
    public void save(Operation operation){
        operations.add(operation);
    }
    public List<Operation> findAll(){
        return new ArrayList<>(operations);
    }
}
