package graphic.pattern.prototype;

import java.util.HashMap;
import java.util.Map;

public class Manager {
    private Map<String, Produce> showCase = new HashMap<>();

    public void register(String name, Produce proto) {
        showCase.put(name, proto);
    }

    public Produce create(String protoname) {
        Produce p = showCase.get(protoname);
        return p.createClone();
    }
}
