package collection;

/**
 * Created by xl on 2017/5/25.
 */
public class Book {
    public String name;

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Book other = (Book) obj;
        if (this.name == other.name) {
            return true;
        }
        return false;
    }
}
