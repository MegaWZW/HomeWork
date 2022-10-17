package war_and_peace.api;

public interface IConverter<T> {
    String convert(T source);
}
