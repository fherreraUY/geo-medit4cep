/**
 */
package eventpattern.provider;

import eventpattern.util.EventpatternAdapterFactory;

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
public class EventpatternItemProviderAdapterFactory extends EventpatternAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable
{
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
  public EventpatternItemProviderAdapterFactory()
  {
    supportedTypes.add(IEditingDomainItemProvider.class);
    supportedTypes.add(IStructuredItemContentProvider.class);
    supportedTypes.add(ITreeItemContentProvider.class);
    supportedTypes.add(IItemLabelProvider.class);
    supportedTypes.add(IItemPropertySource.class);
  }

  /**
   * This keeps track of the one adapter used for all {@link eventpattern.CEPEventPattern} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CEPEventPatternItemProvider cepEventPatternItemProvider;

  /**
   * This creates an adapter for a {@link eventpattern.CEPEventPattern}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createCEPEventPatternAdapter()
  {
    if (cepEventPatternItemProvider == null)
    {
      cepEventPatternItemProvider = new CEPEventPatternItemProvider(this);
    }

    return cepEventPatternItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link eventpattern.Link} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LinkItemProvider linkItemProvider;

  /**
   * This creates an adapter for a {@link eventpattern.Link}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createLinkAdapter()
  {
    if (linkItemProvider == null)
    {
      linkItemProvider = new LinkItemProvider(this);
    }

    return linkItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link eventpattern.ComplexEvent} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ComplexEventItemProvider complexEventItemProvider;

  /**
   * This creates an adapter for a {@link eventpattern.ComplexEvent}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createComplexEventAdapter()
  {
    if (complexEventItemProvider == null)
    {
      complexEventItemProvider = new ComplexEventItemProvider(this);
    }

    return complexEventItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link eventpattern.ComplexEventProperty} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ComplexEventPropertyItemProvider complexEventPropertyItemProvider;

  /**
   * This creates an adapter for a {@link eventpattern.ComplexEventProperty}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createComplexEventPropertyAdapter()
  {
    if (complexEventPropertyItemProvider == null)
    {
      complexEventPropertyItemProvider = new ComplexEventPropertyItemProvider(this);
    }

    return complexEventPropertyItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link eventpattern.SlidingEventInterval} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SlidingEventIntervalItemProvider slidingEventIntervalItemProvider;

  /**
   * This creates an adapter for a {@link eventpattern.SlidingEventInterval}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createSlidingEventIntervalAdapter()
  {
    if (slidingEventIntervalItemProvider == null)
    {
      slidingEventIntervalItemProvider = new SlidingEventIntervalItemProvider(this);
    }

    return slidingEventIntervalItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link eventpattern.BatchingEventInterval} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BatchingEventIntervalItemProvider batchingEventIntervalItemProvider;

  /**
   * This creates an adapter for a {@link eventpattern.BatchingEventInterval}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createBatchingEventIntervalAdapter()
  {
    if (batchingEventIntervalItemProvider == null)
    {
      batchingEventIntervalItemProvider = new BatchingEventIntervalItemProvider(this);
    }

    return batchingEventIntervalItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link eventpattern.SlidingTimeInterval} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SlidingTimeIntervalItemProvider slidingTimeIntervalItemProvider;

  /**
   * This creates an adapter for a {@link eventpattern.SlidingTimeInterval}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createSlidingTimeIntervalAdapter()
  {
    if (slidingTimeIntervalItemProvider == null)
    {
      slidingTimeIntervalItemProvider = new SlidingTimeIntervalItemProvider(this);
    }

    return slidingTimeIntervalItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link eventpattern.BatchingTimeInterval} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BatchingTimeIntervalItemProvider batchingTimeIntervalItemProvider;

  /**
   * This creates an adapter for a {@link eventpattern.BatchingTimeInterval}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createBatchingTimeIntervalAdapter()
  {
    if (batchingTimeIntervalItemProvider == null)
    {
      batchingTimeIntervalItemProvider = new BatchingTimeIntervalItemProvider(this);
    }

    return batchingTimeIntervalItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link eventpattern.Every} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EveryItemProvider everyItemProvider;

  /**
   * This creates an adapter for a {@link eventpattern.Every}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createEveryAdapter()
  {
    if (everyItemProvider == null)
    {
      everyItemProvider = new EveryItemProvider(this);
    }

    return everyItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link eventpattern.EveryDistinct} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EveryDistinctItemProvider everyDistinctItemProvider;

  /**
   * This creates an adapter for a {@link eventpattern.EveryDistinct}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createEveryDistinctAdapter()
  {
    if (everyDistinctItemProvider == null)
    {
      everyDistinctItemProvider = new EveryDistinctItemProvider(this);
    }

    return everyDistinctItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link eventpattern.Repeat} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RepeatItemProvider repeatItemProvider;

  /**
   * This creates an adapter for a {@link eventpattern.Repeat}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createRepeatAdapter()
  {
    if (repeatItemProvider == null)
    {
      repeatItemProvider = new RepeatItemProvider(this);
    }

    return repeatItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link eventpattern.Until} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UntilItemProvider untilItemProvider;

  /**
   * This creates an adapter for a {@link eventpattern.Until}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createUntilAdapter()
  {
    if (untilItemProvider == null)
    {
      untilItemProvider = new UntilItemProvider(this);
    }

    return untilItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link eventpattern.Range} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RangeItemProvider rangeItemProvider;

  /**
   * This creates an adapter for a {@link eventpattern.Range}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createRangeAdapter()
  {
    if (rangeItemProvider == null)
    {
      rangeItemProvider = new RangeItemProvider(this);
    }

    return rangeItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link eventpattern.FollowedBy} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FollowedByItemProvider followedByItemProvider;

  /**
   * This creates an adapter for a {@link eventpattern.FollowedBy}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createFollowedByAdapter()
  {
    if (followedByItemProvider == null)
    {
      followedByItemProvider = new FollowedByItemProvider(this);
    }

    return followedByItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link eventpattern.While} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WhileItemProvider whileItemProvider;

  /**
   * This creates an adapter for a {@link eventpattern.While}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createWhileAdapter()
  {
    if (whileItemProvider == null)
    {
      whileItemProvider = new WhileItemProvider(this);
    }

    return whileItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link eventpattern.And} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AndItemProvider andItemProvider;

  /**
   * This creates an adapter for a {@link eventpattern.And}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createAndAdapter()
  {
    if (andItemProvider == null)
    {
      andItemProvider = new AndItemProvider(this);
    }

    return andItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link eventpattern.Or} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OrItemProvider orItemProvider;

  /**
   * This creates an adapter for a {@link eventpattern.Or}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createOrAdapter()
  {
    if (orItemProvider == null)
    {
      orItemProvider = new OrItemProvider(this);
    }

    return orItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link eventpattern.Not} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NotItemProvider notItemProvider;

  /**
   * This creates an adapter for a {@link eventpattern.Not}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createNotAdapter()
  {
    if (notItemProvider == null)
    {
      notItemProvider = new NotItemProvider(this);
    }

    return notItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link eventpattern.Addition} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AdditionItemProvider additionItemProvider;

  /**
   * This creates an adapter for a {@link eventpattern.Addition}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createAdditionAdapter()
  {
    if (additionItemProvider == null)
    {
      additionItemProvider = new AdditionItemProvider(this);
    }

    return additionItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link eventpattern.Subtraction} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SubtractionItemProvider subtractionItemProvider;

  /**
   * This creates an adapter for a {@link eventpattern.Subtraction}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createSubtractionAdapter()
  {
    if (subtractionItemProvider == null)
    {
      subtractionItemProvider = new SubtractionItemProvider(this);
    }

    return subtractionItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link eventpattern.Multiplication} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MultiplicationItemProvider multiplicationItemProvider;

  /**
   * This creates an adapter for a {@link eventpattern.Multiplication}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createMultiplicationAdapter()
  {
    if (multiplicationItemProvider == null)
    {
      multiplicationItemProvider = new MultiplicationItemProvider(this);
    }

    return multiplicationItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link eventpattern.Division} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DivisionItemProvider divisionItemProvider;

  /**
   * This creates an adapter for a {@link eventpattern.Division}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createDivisionAdapter()
  {
    if (divisionItemProvider == null)
    {
      divisionItemProvider = new DivisionItemProvider(this);
    }

    return divisionItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link eventpattern.Modulus} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModulusItemProvider modulusItemProvider;

  /**
   * This creates an adapter for a {@link eventpattern.Modulus}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createModulusAdapter()
  {
    if (modulusItemProvider == null)
    {
      modulusItemProvider = new ModulusItemProvider(this);
    }

    return modulusItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link eventpattern.Equal} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EqualItemProvider equalItemProvider;

  /**
   * This creates an adapter for a {@link eventpattern.Equal}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createEqualAdapter()
  {
    if (equalItemProvider == null)
    {
      equalItemProvider = new EqualItemProvider(this);
    }

    return equalItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link eventpattern.NotEqual} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NotEqualItemProvider notEqualItemProvider;

  /**
   * This creates an adapter for a {@link eventpattern.NotEqual}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createNotEqualAdapter()
  {
    if (notEqualItemProvider == null)
    {
      notEqualItemProvider = new NotEqualItemProvider(this);
    }

    return notEqualItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link eventpattern.LessThan} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LessThanItemProvider lessThanItemProvider;

  /**
   * This creates an adapter for a {@link eventpattern.LessThan}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createLessThanAdapter()
  {
    if (lessThanItemProvider == null)
    {
      lessThanItemProvider = new LessThanItemProvider(this);
    }

    return lessThanItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link eventpattern.GreaterThan} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GreaterThanItemProvider greaterThanItemProvider;

  /**
   * This creates an adapter for a {@link eventpattern.GreaterThan}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createGreaterThanAdapter()
  {
    if (greaterThanItemProvider == null)
    {
      greaterThanItemProvider = new GreaterThanItemProvider(this);
    }

    return greaterThanItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link eventpattern.LessEqual} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LessEqualItemProvider lessEqualItemProvider;

  /**
   * This creates an adapter for a {@link eventpattern.LessEqual}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createLessEqualAdapter()
  {
    if (lessEqualItemProvider == null)
    {
      lessEqualItemProvider = new LessEqualItemProvider(this);
    }

    return lessEqualItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link eventpattern.GreaterEqual} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GreaterEqualItemProvider greaterEqualItemProvider;

  /**
   * This creates an adapter for a {@link eventpattern.GreaterEqual}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createGreaterEqualAdapter()
  {
    if (greaterEqualItemProvider == null)
    {
      greaterEqualItemProvider = new GreaterEqualItemProvider(this);
    }

    return greaterEqualItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link eventpattern.Max} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MaxItemProvider maxItemProvider;

  /**
   * This creates an adapter for a {@link eventpattern.Max}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createMaxAdapter()
  {
    if (maxItemProvider == null)
    {
      maxItemProvider = new MaxItemProvider(this);
    }

    return maxItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link eventpattern.Min} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MinItemProvider minItemProvider;

  /**
   * This creates an adapter for a {@link eventpattern.Min}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createMinAdapter()
  {
    if (minItemProvider == null)
    {
      minItemProvider = new MinItemProvider(this);
    }

    return minItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link eventpattern.Avg} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AvgItemProvider avgItemProvider;

  /**
   * This creates an adapter for a {@link eventpattern.Avg}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createAvgAdapter()
  {
    if (avgItemProvider == null)
    {
      avgItemProvider = new AvgItemProvider(this);
    }

    return avgItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link eventpattern.Count} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CountItemProvider countItemProvider;

  /**
   * This creates an adapter for a {@link eventpattern.Count}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createCountAdapter()
  {
    if (countItemProvider == null)
    {
      countItemProvider = new CountItemProvider(this);
    }

    return countItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link eventpattern.Sum} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SumItemProvider sumItemProvider;

  /**
   * This creates an adapter for a {@link eventpattern.Sum}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createSumAdapter()
  {
    if (sumItemProvider == null)
    {
      sumItemProvider = new SumItemProvider(this);
    }

    return sumItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link eventpattern.WithinTimer} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WithinTimerItemProvider withinTimerItemProvider;

  /**
   * This creates an adapter for a {@link eventpattern.WithinTimer}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createWithinTimerAdapter()
  {
    if (withinTimerItemProvider == null)
    {
      withinTimerItemProvider = new WithinTimerItemProvider(this);
    }

    return withinTimerItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link eventpattern.TimeInterval} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TimeIntervalItemProvider timeIntervalItemProvider;

  /**
   * This creates an adapter for a {@link eventpattern.TimeInterval}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createTimeIntervalAdapter()
  {
    if (timeIntervalItemProvider == null)
    {
      timeIntervalItemProvider = new TimeIntervalItemProvider(this);
    }

    return timeIntervalItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link eventpattern.TimeSchedule} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TimeScheduleItemProvider timeScheduleItemProvider;

  /**
   * This creates an adapter for a {@link eventpattern.TimeSchedule}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createTimeScheduleAdapter()
  {
    if (timeScheduleItemProvider == null)
    {
      timeScheduleItemProvider = new TimeScheduleItemProvider(this);
    }

    return timeScheduleItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link eventpattern.Event} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EventItemProvider eventItemProvider;

  /**
   * This creates an adapter for a {@link eventpattern.Event}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createEventAdapter()
  {
    if (eventItemProvider == null)
    {
      eventItemProvider = new EventItemProvider(this);
    }

    return eventItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link eventpattern.EventProperty} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EventPropertyItemProvider eventPropertyItemProvider;

  /**
   * This creates an adapter for a {@link eventpattern.EventProperty}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createEventPropertyAdapter()
  {
    if (eventPropertyItemProvider == null)
    {
      eventPropertyItemProvider = new EventPropertyItemProvider(this);
    }

    return eventPropertyItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link eventpattern.Value} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ValueItemProvider valueItemProvider;

  /**
   * This creates an adapter for a {@link eventpattern.Value}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createValueAdapter()
  {
    if (valueItemProvider == null)
    {
      valueItemProvider = new ValueItemProvider(this);
    }

    return valueItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link eventpattern.Email} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EmailItemProvider emailItemProvider;

  /**
   * This creates an adapter for a {@link eventpattern.Email}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createEmailAdapter()
  {
    if (emailItemProvider == null)
    {
      emailItemProvider = new EmailItemProvider(this);
    }

    return emailItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link eventpattern.Twitter} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TwitterItemProvider twitterItemProvider;

  /**
   * This creates an adapter for a {@link eventpattern.Twitter}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createTwitterAdapter()
  {
    if (twitterItemProvider == null)
    {
      twitterItemProvider = new TwitterItemProvider(this);
    }

    return twitterItemProvider;
  }

  /**
   * This returns the root adapter factory that contains this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComposeableAdapterFactory getRootAdapterFactory()
  {
    return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
  }

  /**
   * This sets the composed adapter factory that contains this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory)
  {
    this.parentAdapterFactory = parentAdapterFactory;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object type)
  {
    return supportedTypes.contains(type) || super.isFactoryForType(type);
  }

  /**
   * This implementation substitutes the factory itself as the key for the adapter.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter adapt(Notifier notifier, Object type)
  {
    return super.adapt(notifier, this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object adapt(Object object, Object type)
  {
    if (isFactoryForType(type))
    {
      Object adapter = super.adapt(object, type);
      if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter)))
      {
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
  public void addListener(INotifyChangedListener notifyChangedListener)
  {
    changeNotifier.addListener(notifyChangedListener);
  }

  /**
   * This removes a listener.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void removeListener(INotifyChangedListener notifyChangedListener)
  {
    changeNotifier.removeListener(notifyChangedListener);
  }

  /**
   * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void fireNotifyChanged(Notification notification)
  {
    changeNotifier.fireNotifyChanged(notification);

    if (parentAdapterFactory != null)
    {
      parentAdapterFactory.fireNotifyChanged(notification);
    }
  }

  /**
   * This disposes all of the item providers created by this factory. 
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void dispose()
  {
    if (cepEventPatternItemProvider != null) cepEventPatternItemProvider.dispose();
    if (linkItemProvider != null) linkItemProvider.dispose();
    if (complexEventItemProvider != null) complexEventItemProvider.dispose();
    if (complexEventPropertyItemProvider != null) complexEventPropertyItemProvider.dispose();
    if (slidingEventIntervalItemProvider != null) slidingEventIntervalItemProvider.dispose();
    if (batchingEventIntervalItemProvider != null) batchingEventIntervalItemProvider.dispose();
    if (slidingTimeIntervalItemProvider != null) slidingTimeIntervalItemProvider.dispose();
    if (batchingTimeIntervalItemProvider != null) batchingTimeIntervalItemProvider.dispose();
    if (everyItemProvider != null) everyItemProvider.dispose();
    if (everyDistinctItemProvider != null) everyDistinctItemProvider.dispose();
    if (repeatItemProvider != null) repeatItemProvider.dispose();
    if (untilItemProvider != null) untilItemProvider.dispose();
    if (rangeItemProvider != null) rangeItemProvider.dispose();
    if (followedByItemProvider != null) followedByItemProvider.dispose();
    if (whileItemProvider != null) whileItemProvider.dispose();
    if (andItemProvider != null) andItemProvider.dispose();
    if (orItemProvider != null) orItemProvider.dispose();
    if (notItemProvider != null) notItemProvider.dispose();
    if (additionItemProvider != null) additionItemProvider.dispose();
    if (subtractionItemProvider != null) subtractionItemProvider.dispose();
    if (multiplicationItemProvider != null) multiplicationItemProvider.dispose();
    if (divisionItemProvider != null) divisionItemProvider.dispose();
    if (modulusItemProvider != null) modulusItemProvider.dispose();
    if (equalItemProvider != null) equalItemProvider.dispose();
    if (notEqualItemProvider != null) notEqualItemProvider.dispose();
    if (lessThanItemProvider != null) lessThanItemProvider.dispose();
    if (greaterThanItemProvider != null) greaterThanItemProvider.dispose();
    if (lessEqualItemProvider != null) lessEqualItemProvider.dispose();
    if (greaterEqualItemProvider != null) greaterEqualItemProvider.dispose();
    if (maxItemProvider != null) maxItemProvider.dispose();
    if (minItemProvider != null) minItemProvider.dispose();
    if (avgItemProvider != null) avgItemProvider.dispose();
    if (countItemProvider != null) countItemProvider.dispose();
    if (sumItemProvider != null) sumItemProvider.dispose();
    if (withinTimerItemProvider != null) withinTimerItemProvider.dispose();
    if (timeIntervalItemProvider != null) timeIntervalItemProvider.dispose();
    if (timeScheduleItemProvider != null) timeScheduleItemProvider.dispose();
    if (eventItemProvider != null) eventItemProvider.dispose();
    if (eventPropertyItemProvider != null) eventPropertyItemProvider.dispose();
    if (valueItemProvider != null) valueItemProvider.dispose();
    if (emailItemProvider != null) emailItemProvider.dispose();
    if (twitterItemProvider != null) twitterItemProvider.dispose();
  }

}
