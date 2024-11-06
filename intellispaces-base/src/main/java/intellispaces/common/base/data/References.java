package intellispaces.common.base.data;

/**
 * Reference provider.
 */
public interface References {

  static <T> Reference<T> get(T target) {
    return new DirectReferenceImpl<>(target);
  }
}
