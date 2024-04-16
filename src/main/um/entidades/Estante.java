package src.main.um.entidades;

import src.main.um.interfaces.Despensable;

import java.util.Map;

public class Estante {
    Map<String, Despensable> utensilios;

    public Estante() {
    }

    public Estante(Map<String, Despensable> utensilios) {
        this.utensilios = utensilios;
    }

    public Map<String, Despensable> getUtensilios() {
        return utensilios;
    }

    public void setUtensilios(Map<String, Despensable> utensilios) {
        this.utensilios = utensilios;
    }

    public void addUtensilio(String nombre, Despensable utensilio) {
        utensilios.put(nombre, utensilio);
    }

    public Despensable getUtensilio(String nombre) {
        return utensilios.get(nombre);
    }

    @Override
    public String toString() {
        StringBuilder utensiliosStr = new StringBuilder("Utensilios:\n");
        for (Map.Entry<String, Despensable> entry : utensilios.entrySet()) {
            utensiliosStr.append(entry.getKey()).append(": ").append(entry.getValue()).append("\n");
        }
        return utensiliosStr.toString();
    }
}
