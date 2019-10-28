package headfirst.pattern.template.sort;

public class Duck implements Comparable<Duck> {
    String name;
    int weight;

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return name + " weights " + weight;
    }

    public Duck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public int compareTo(Duck o) {
        return Integer.compare(weight, o.getWeight());
    }
}
