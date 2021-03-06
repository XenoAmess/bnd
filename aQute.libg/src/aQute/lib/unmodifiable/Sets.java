package aQute.lib.unmodifiable;

import java.util.Collection;
import java.util.Set;

public class Sets {

	private Sets() {}

	public static <E> Set<E> of() {
		return new ImmutableSet<>();
	}

	public static <E> Set<E> of(E e1) {
		return new ImmutableSet<>(e1);
	}

	public static <E> Set<E> of(E e1, E e2) {
		return new ImmutableSet<>(e1, e2);
	}

	public static <E> Set<E> of(E e1, E e2, E e3) {
		return new ImmutableSet<>(e1, e2, e3);
	}

	public static <E> Set<E> of(E e1, E e2, E e3, E e4) {
		return new ImmutableSet<>(e1, e2, e3, e4);
	}

	public static <E> Set<E> of(E e1, E e2, E e3, E e4, E e5) {
		return new ImmutableSet<>(e1, e2, e3, e4, e5);
	}

	public static <E> Set<E> of(E e1, E e2, E e3, E e4, E e5, E e6) {
		return new ImmutableSet<>(e1, e2, e3, e4, e5, e6);
	}

	public static <E> Set<E> of(E e1, E e2, E e3, E e4, E e5, E e6, E e7) {
		return new ImmutableSet<>(e1, e2, e3, e4, e5, e6, e7);
	}

	public static <E> Set<E> of(E e1, E e2, E e3, E e4, E e5, E e6, E e7, E e8) {
		return new ImmutableSet<>(e1, e2, e3, e4, e5, e6, e7, e8);
	}

	public static <E> Set<E> of(E e1, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9) {
		return new ImmutableSet<>(e1, e2, e3, e4, e5, e6, e7, e8, e9);
	}

	public static <E> Set<E> of(E e1, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9, E e10) {
		return new ImmutableSet<>(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10);
	}

	@SafeVarargs
	public static <E> Set<E> of(E... elements) {
		return new ImmutableSet<>(elements);
	}

	@SuppressWarnings("unchecked")
	public static <E> Set<E> copyOf(Collection<? extends E> collection) {
		if (collection instanceof ImmutableSet) {
			return (Set<E>) collection;
		}
		E[] elements = (E[]) collection.stream()
			.distinct()
			.toArray();
		return new ImmutableSet<>(elements);
	}
}
