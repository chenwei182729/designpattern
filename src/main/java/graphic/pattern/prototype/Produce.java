package graphic.pattern.prototype;

public interface Produce {
    void use(String s);

    Produce createClone();
}
