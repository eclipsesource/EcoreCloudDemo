/**
 */
package myecore.myecore;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>State</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see myecore.myecore.myecorePackage#getState()
 * @model
 * @generated
 */
public final class State extends AbstractEnumerator {
	/**
	 * The '<em><b>Open</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPEN_LITERAL
	 * @model name="open"
	 * @generated
	 * @ordered
	 */
	public static final int OPEN = 6;

	/**
	 * The '<em><b>Close</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLOSE_LITERAL
	 * @model name="close"
	 * @generated
	 * @ordered
	 */
	public static final int CLOSE = 7;

	/**
	 * The '<em><b>Open</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPEN
	 * @generated
	 * @ordered
	 */
	public static final State OPEN_LITERAL = new State(OPEN, "open", "open");

	/**
	 * The '<em><b>Close</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLOSE
	 * @generated
	 * @ordered
	 */
	public static final State CLOSE_LITERAL = new State(CLOSE, "close", "close");

	/**
	 * An array of all the '<em><b>State</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final State[] VALUES_ARRAY =
		new State[] {
			OPEN_LITERAL,
			CLOSE_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>State</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>State</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static State get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			State result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>State</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static State getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			State result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>State</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static State get(int value) {
		switch (value) {
			case OPEN: return OPEN_LITERAL;
			case CLOSE: return CLOSE_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private State(int value, String name, String literal) {
		super(value, name, literal);
	}

} //State
