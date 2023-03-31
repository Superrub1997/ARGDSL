/**
 */
package Gameloop.impl;

import Gameloop.Action;
import Gameloop.GameloopPackage;
import Gameloop.PhysicChange;

import Gameloop.Position;
import Physics.Force;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Physic Change</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gameloop.impl.PhysicChangeImpl#getScale <em>Scale</em>}</li>
 *   <li>{@link Gameloop.impl.PhysicChangeImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link Gameloop.impl.PhysicChangeImpl#getChangeValue <em>Change Value</em>}</li>
 *   <li>{@link Gameloop.impl.PhysicChangeImpl#getAction <em>Action</em>}</li>
 *   <li>{@link Gameloop.impl.PhysicChangeImpl#getObject <em>Object</em>}</li>
 *   <li>{@link Gameloop.impl.PhysicChangeImpl#getForce <em>Force</em>}</li>
 *   <li>{@link Gameloop.impl.PhysicChangeImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link Gameloop.impl.PhysicChangeImpl#getClass_ <em>Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PhysicChangeImpl extends MinimalEObjectImpl.Container implements PhysicChange {
	/**
	 * The default value of the '{@link #getScale() <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScale()
	 * @generated
	 * @ordered
	 */
	protected static final double SCALE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getScale() <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScale()
	 * @generated
	 * @ordered
	 */
	protected double scale = SCALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAttribute() <em>Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribute()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTRIBUTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribute()
	 * @generated
	 * @ordered
	 */
	protected String attribute = ATTRIBUTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getChangeValue() <em>Change Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeValue()
	 * @generated
	 * @ordered
	 */
	protected static final int CHANGE_VALUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getChangeValue() <em>Change Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeValue()
	 * @generated
	 * @ordered
	 */
	protected int changeValue = CHANGE_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAction() <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected static final Action ACTION_EDEFAULT = Action.CREATE;

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected Action action = ACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getObject() <em>Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObject()
	 * @generated
	 * @ordered
	 */
	protected static final String OBJECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getObject() <em>Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObject()
	 * @generated
	 * @ordered
	 */
	protected String object = OBJECT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getForce() <em>Force</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForce()
	 * @generated
	 * @ordered
	 */
	protected Force force;

	/**
	 * The default value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected static final Position POSITION_EDEFAULT = Position.FRONT;

	/**
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected Position position = POSITION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getClass_() <em>Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected Ontologicals.Class class_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhysicChangeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GameloopPackage.Literals.PHYSIC_CHANGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAttribute() {
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttribute(String newAttribute) {
		String oldAttribute = attribute;
		attribute = newAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GameloopPackage.PHYSIC_CHANGE__ATTRIBUTE, oldAttribute, attribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getChangeValue() {
		return changeValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChangeValue(int newChangeValue) {
		int oldChangeValue = changeValue;
		changeValue = newChangeValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GameloopPackage.PHYSIC_CHANGE__CHANGE_VALUE, oldChangeValue, changeValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action getAction() {
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAction(Action newAction) {
		Action oldAction = action;
		action = newAction == null ? ACTION_EDEFAULT : newAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GameloopPackage.PHYSIC_CHANGE__ACTION, oldAction, action));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getObject() {
		return object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObject(String newObject) {
		String oldObject = object;
		object = newObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GameloopPackage.PHYSIC_CHANGE__OBJECT, oldObject, object));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Force getForce() {
		if (force != null && force.eIsProxy()) {
			InternalEObject oldForce = (InternalEObject)force;
			force = (Force)eResolveProxy(oldForce);
			if (force != oldForce) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GameloopPackage.PHYSIC_CHANGE__FORCE, oldForce, force));
			}
		}
		return force;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Force basicGetForce() {
		return force;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForce(Force newForce) {
		Force oldForce = force;
		force = newForce;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GameloopPackage.PHYSIC_CHANGE__FORCE, oldForce, force));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Position getPosition() {
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosition(Position newPosition) {
		Position oldPosition = position;
		position = newPosition == null ? POSITION_EDEFAULT : newPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GameloopPackage.PHYSIC_CHANGE__POSITION, oldPosition, position));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ontologicals.Class getClass_() {
		if (class_ != null && class_.eIsProxy()) {
			InternalEObject oldClass = (InternalEObject)class_;
			class_ = (Ontologicals.Class)eResolveProxy(oldClass);
			if (class_ != oldClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GameloopPackage.PHYSIC_CHANGE__CLASS, oldClass, class_));
			}
		}
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ontologicals.Class basicGetClass() {
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClass(Ontologicals.Class newClass) {
		Ontologicals.Class oldClass = class_;
		class_ = newClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GameloopPackage.PHYSIC_CHANGE__CLASS, oldClass, class_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getScale() {
		return scale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScale(double newScale) {
		double oldScale = scale;
		scale = newScale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GameloopPackage.PHYSIC_CHANGE__SCALE, oldScale, scale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GameloopPackage.PHYSIC_CHANGE__SCALE:
				return getScale();
			case GameloopPackage.PHYSIC_CHANGE__ATTRIBUTE:
				return getAttribute();
			case GameloopPackage.PHYSIC_CHANGE__CHANGE_VALUE:
				return getChangeValue();
			case GameloopPackage.PHYSIC_CHANGE__ACTION:
				return getAction();
			case GameloopPackage.PHYSIC_CHANGE__OBJECT:
				return getObject();
			case GameloopPackage.PHYSIC_CHANGE__FORCE:
				if (resolve) return getForce();
				return basicGetForce();
			case GameloopPackage.PHYSIC_CHANGE__POSITION:
				return getPosition();
			case GameloopPackage.PHYSIC_CHANGE__CLASS:
				if (resolve) return getClass_();
				return basicGetClass();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GameloopPackage.PHYSIC_CHANGE__SCALE:
				setScale((Double)newValue);
				return;
			case GameloopPackage.PHYSIC_CHANGE__ATTRIBUTE:
				setAttribute((String)newValue);
				return;
			case GameloopPackage.PHYSIC_CHANGE__CHANGE_VALUE:
				setChangeValue((Integer)newValue);
				return;
			case GameloopPackage.PHYSIC_CHANGE__ACTION:
				setAction((Action)newValue);
				return;
			case GameloopPackage.PHYSIC_CHANGE__OBJECT:
				setObject((String)newValue);
				return;
			case GameloopPackage.PHYSIC_CHANGE__FORCE:
				setForce((Force)newValue);
				return;
			case GameloopPackage.PHYSIC_CHANGE__POSITION:
				setPosition((Position)newValue);
				return;
			case GameloopPackage.PHYSIC_CHANGE__CLASS:
				setClass((Ontologicals.Class)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GameloopPackage.PHYSIC_CHANGE__SCALE:
				setScale(SCALE_EDEFAULT);
				return;
			case GameloopPackage.PHYSIC_CHANGE__ATTRIBUTE:
				setAttribute(ATTRIBUTE_EDEFAULT);
				return;
			case GameloopPackage.PHYSIC_CHANGE__CHANGE_VALUE:
				setChangeValue(CHANGE_VALUE_EDEFAULT);
				return;
			case GameloopPackage.PHYSIC_CHANGE__ACTION:
				setAction(ACTION_EDEFAULT);
				return;
			case GameloopPackage.PHYSIC_CHANGE__OBJECT:
				setObject(OBJECT_EDEFAULT);
				return;
			case GameloopPackage.PHYSIC_CHANGE__FORCE:
				setForce((Force)null);
				return;
			case GameloopPackage.PHYSIC_CHANGE__POSITION:
				setPosition(POSITION_EDEFAULT);
				return;
			case GameloopPackage.PHYSIC_CHANGE__CLASS:
				setClass((Ontologicals.Class)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GameloopPackage.PHYSIC_CHANGE__SCALE:
				return scale != SCALE_EDEFAULT;
			case GameloopPackage.PHYSIC_CHANGE__ATTRIBUTE:
				return ATTRIBUTE_EDEFAULT == null ? attribute != null : !ATTRIBUTE_EDEFAULT.equals(attribute);
			case GameloopPackage.PHYSIC_CHANGE__CHANGE_VALUE:
				return changeValue != CHANGE_VALUE_EDEFAULT;
			case GameloopPackage.PHYSIC_CHANGE__ACTION:
				return action != ACTION_EDEFAULT;
			case GameloopPackage.PHYSIC_CHANGE__OBJECT:
				return OBJECT_EDEFAULT == null ? object != null : !OBJECT_EDEFAULT.equals(object);
			case GameloopPackage.PHYSIC_CHANGE__FORCE:
				return force != null;
			case GameloopPackage.PHYSIC_CHANGE__POSITION:
				return position != POSITION_EDEFAULT;
			case GameloopPackage.PHYSIC_CHANGE__CLASS:
				return class_ != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (scale: ");
		result.append(scale);
		result.append(", attribute: ");
		result.append(attribute);
		result.append(", changeValue: ");
		result.append(changeValue);
		result.append(", action: ");
		result.append(action);
		result.append(", object: ");
		result.append(object);
		result.append(", position: ");
		result.append(position);
		result.append(')');
		return result.toString();
	}

} //PhysicChangeImpl
