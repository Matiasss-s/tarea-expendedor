public abstract class Moneda implements Comparable<Moneda> {
    public Moneda() {}

    public abstract int getValor();

    @Override
    public int compareTo(Moneda m) {
        return Integer.compare(this.getValor(), m.getValor());
    }

    @Override
    public String toString() {
        return "Moneda de: " + this.getValor() + " (Serie: " + this.hashCode() + ")";
    }
}