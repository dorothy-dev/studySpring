package dorothy;

public interface LineCallback<T> {
	T doSomethingWithline(String line, T value);
}
