package eighteen;

import java.io.Serializable;

public class GenericClass<T extends Comparable<T>, V extends Animal & Serializable, K> {
    private T variableT;
    private V variableV;
    private K variableK;

    public GenericClass(T variableT, V variableV, K variableK) {
        this.variableT = variableT;
        this.variableV = variableV;
        this.variableK = variableK;
    }

    public T getVariableT() {
        return variableT;
    }

    public V getVariableV() {
        return variableV;
    }

    public K getVariableK() {
        return variableK;
    }

    public void displayClassNames() {
        System.out.println("Class of variableT: " + variableT.getClass().getName());
        System.out.println("Class of variableV: " + variableV.getClass().getName());
        System.out.println("Class of variableK: " + variableK.getClass().getName());
    }
}