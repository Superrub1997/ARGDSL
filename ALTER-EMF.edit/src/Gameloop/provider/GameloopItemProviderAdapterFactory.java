/**
 */
package Gameloop.provider;

import Gameloop.util.GameloopAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GameloopItemProviderAdapterFactory extends GameloopAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GameloopItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link Gameloop.Game} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GameItemProvider gameItemProvider;

	/**
	 * This creates an adapter for a {@link Gameloop.Game}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGameAdapter() {
		if (gameItemProvider == null) {
			gameItemProvider = new GameItemProvider(this);
		}

		return gameItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link Gameloop.GamePad} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GamePadItemProvider gamePadItemProvider;

	/**
	 * This creates an adapter for a {@link Gameloop.GamePad}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGamePadAdapter() {
		if (gamePadItemProvider == null) {
			gamePadItemProvider = new GamePadItemProvider(this);
		}

		return gamePadItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link Gameloop.ObjInit} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjInitItemProvider objInitItemProvider;

	/**
	 * This creates an adapter for a {@link Gameloop.ObjInit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createObjInitAdapter() {
		if (objInitItemProvider == null) {
			objInitItemProvider = new ObjInitItemProvider(this);
		}

		return objInitItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link Gameloop.ObjAttribute} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjAttributeItemProvider objAttributeItemProvider;

	/**
	 * This creates an adapter for a {@link Gameloop.ObjAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createObjAttributeAdapter() {
		if (objAttributeItemProvider == null) {
			objAttributeItemProvider = new ObjAttributeItemProvider(this);
		}

		return objAttributeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link Gameloop.ScoreSystem} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScoreSystemItemProvider scoreSystemItemProvider;

	/**
	 * This creates an adapter for a {@link Gameloop.ScoreSystem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createScoreSystemAdapter() {
		if (scoreSystemItemProvider == null) {
			scoreSystemItemProvider = new ScoreSystemItemProvider(this);
		}

		return scoreSystemItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link Gameloop.Trigger} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TriggerItemProvider triggerItemProvider;

	/**
	 * This creates an adapter for a {@link Gameloop.Trigger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTriggerAdapter() {
		if (triggerItemProvider == null) {
			triggerItemProvider = new TriggerItemProvider(this);
		}

		return triggerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link Gameloop.Collision} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CollisionItemProvider collisionItemProvider;

	/**
	 * This creates an adapter for a {@link Gameloop.Collision}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCollisionAdapter() {
		if (collisionItemProvider == null) {
			collisionItemProvider = new CollisionItemProvider(this);
		}

		return collisionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link Gameloop.PhysicChange} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhysicChangeItemProvider physicChangeItemProvider;

	/**
	 * This creates an adapter for a {@link Gameloop.PhysicChange}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPhysicChangeAdapter() {
		if (physicChangeItemProvider == null) {
			physicChangeItemProvider = new PhysicChangeItemProvider(this);
		}

		return physicChangeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link Gameloop.Rule} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuleItemProvider ruleItemProvider;

	/**
	 * This creates an adapter for a {@link Gameloop.Rule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRuleAdapter() {
		if (ruleItemProvider == null) {
			ruleItemProvider = new RuleItemProvider(this);
		}

		return ruleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link Gameloop.Not} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NotItemProvider notItemProvider;

	/**
	 * This creates an adapter for a {@link Gameloop.Not}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNotAdapter() {
		if (notItemProvider == null) {
			notItemProvider = new NotItemProvider(this);
		}

		return notItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link Gameloop.Arithmetic} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArithmeticItemProvider arithmeticItemProvider;

	/**
	 * This creates an adapter for a {@link Gameloop.Arithmetic}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createArithmeticAdapter() {
		if (arithmeticItemProvider == null) {
			arithmeticItemProvider = new ArithmeticItemProvider(this);
		}

		return arithmeticItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link Gameloop.AllInstances} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AllInstancesItemProvider allInstancesItemProvider;

	/**
	 * This creates an adapter for a {@link Gameloop.AllInstances}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAllInstancesAdapter() {
		if (allInstancesItemProvider == null) {
			allInstancesItemProvider = new AllInstancesItemProvider(this);
		}

		return allInstancesItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link Gameloop.AttributeValue} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeValueItemProvider attributeValueItemProvider;

	/**
	 * This creates an adapter for a {@link Gameloop.AttributeValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAttributeValueAdapter() {
		if (attributeValueItemProvider == null) {
			attributeValueItemProvider = new AttributeValueItemProvider(this);
		}

		return attributeValueItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link Gameloop.ConstantValue} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstantValueItemProvider constantValueItemProvider;

	/**
	 * This creates an adapter for a {@link Gameloop.ConstantValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConstantValueAdapter() {
		if (constantValueItemProvider == null) {
			constantValueItemProvider = new ConstantValueItemProvider(this);
		}

		return constantValueItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link Gameloop.Binary} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BinaryItemProvider binaryItemProvider;

	/**
	 * This creates an adapter for a {@link Gameloop.Binary}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBinaryAdapter() {
		if (binaryItemProvider == null) {
			binaryItemProvider = new BinaryItemProvider(this);
		}

		return binaryItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (gameItemProvider != null) gameItemProvider.dispose();
		if (gamePadItemProvider != null) gamePadItemProvider.dispose();
		if (objInitItemProvider != null) objInitItemProvider.dispose();
		if (objAttributeItemProvider != null) objAttributeItemProvider.dispose();
		if (scoreSystemItemProvider != null) scoreSystemItemProvider.dispose();
		if (triggerItemProvider != null) triggerItemProvider.dispose();
		if (collisionItemProvider != null) collisionItemProvider.dispose();
		if (physicChangeItemProvider != null) physicChangeItemProvider.dispose();
		if (ruleItemProvider != null) ruleItemProvider.dispose();
		if (notItemProvider != null) notItemProvider.dispose();
		if (arithmeticItemProvider != null) arithmeticItemProvider.dispose();
		if (allInstancesItemProvider != null) allInstancesItemProvider.dispose();
		if (attributeValueItemProvider != null) attributeValueItemProvider.dispose();
		if (constantValueItemProvider != null) constantValueItemProvider.dispose();
		if (binaryItemProvider != null) binaryItemProvider.dispose();
	}

}