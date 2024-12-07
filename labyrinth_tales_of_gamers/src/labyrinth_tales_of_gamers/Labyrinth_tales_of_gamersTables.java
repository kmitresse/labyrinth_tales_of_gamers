/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /labyrinth_tales_of_gamers/meta-model/labyrinth.ecore
 * using:
 *   /labyrinth_tales_of_gamers/meta-model/labyrinth.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package labyrinth_tales_of_gamers;

import java.lang.String;
// import labyrinth_tales_of_gamers.Labyrinth_tales_of_gamersPackage;
// import labyrinth_tales_of_gamers.Labyrinth_tales_of_gamersTables;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.DataTypeId;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.NsURIPackageId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreLibraryOppositeProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorPropertyWithImplementation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorType;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.AbstractTables;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;

/**
 * Labyrinth_tales_of_gamersTables provides the dispatch tables for the labyrinth_tales_of_gamers for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class Labyrinth_tales_of_gamersTables extends AbstractTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(Labyrinth_tales_of_gamersPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_labyrinthtalesofgamers_com_s = IdManager.getNsURIPackageId("http://labyrinthtalesofgamers.com/", null, Labyrinth_tales_of_gamersPackage.eINSTANCE);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore = IdManager.getNsURIPackageId("http://www.eclipse.org/emf/2002/Ecore", null, EcorePackage.eINSTANCE);
	public static final /*@NonInvalid*/ ClassId CLSSid_Action = Labyrinth_tales_of_gamersTables.PACKid_http_c_s_s_labyrinthtalesofgamers_com_s.getClassId("Action", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Game = Labyrinth_tales_of_gamersTables.PACKid_http_c_s_s_labyrinthtalesofgamers_com_s.getClassId("Game", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Hint = Labyrinth_tales_of_gamersTables.PACKid_http_c_s_s_labyrinthtalesofgamers_com_s.getClassId("Hint", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_MainCharacter = Labyrinth_tales_of_gamersTables.PACKid_http_c_s_s_labyrinthtalesofgamers_com_s.getClassId("MainCharacter", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Npc = Labyrinth_tales_of_gamersTables.PACKid_http_c_s_s_labyrinthtalesofgamers_com_s.getClassId("Npc", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Room = Labyrinth_tales_of_gamersTables.PACKid_http_c_s_s_labyrinthtalesofgamers_com_s.getClassId("Room", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EInt = Labyrinth_tales_of_gamersTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EInt", 0);
	public static final /*@NonInvalid*/ IntegerValue INT_0 = ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ String STR_Demander_32_l_39_indice = "Demander l\'indice";
	public static final /*@NonInvalid*/ String STR_Lire_32_l_39_indice = "Lire l\'indice";
	public static final /*@NonInvalid*/ String STR_Proposer_32_un_32_nom = "Proposer un nom";
	public static final /*@NonInvalid*/ String STR_Se_32_déplacer = "Se d\u00E9placer";
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_MainCharacter = TypeId.BAG.getSpecializedId(Labyrinth_tales_of_gamersTables.CLSSid_MainCharacter, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Npc = TypeId.BAG.getSpecializedId(Labyrinth_tales_of_gamersTables.CLSSid_Npc, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Action = TypeId.ORDERED_SET.getSpecializedId(Labyrinth_tales_of_gamersTables.CLSSid_Action, false, ValueUtil.ONE_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Room = TypeId.ORDERED_SET.getSpecializedId(Labyrinth_tales_of_gamersTables.CLSSid_Room, false, ValueUtil.ONE_VALUE, ValueUtil.UNLIMITED_VALUE);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			Labyrinth_tales_of_gamersTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Labyrinth_tales_of_gamersTables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final EcoreExecutorType _Action = new EcoreExecutorType(Labyrinth_tales_of_gamersPackage.Literals.ACTION, PACKAGE, 0);
		public static final EcoreExecutorType _Entity = new EcoreExecutorType(Labyrinth_tales_of_gamersPackage.Literals.ENTITY, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _Game = new EcoreExecutorType(Labyrinth_tales_of_gamersPackage.Literals.GAME, PACKAGE, 0);
		public static final EcoreExecutorType _Hint = new EcoreExecutorType(Labyrinth_tales_of_gamersPackage.Literals.HINT, PACKAGE, 0);
		public static final EcoreExecutorType _MainCharacter = new EcoreExecutorType(Labyrinth_tales_of_gamersPackage.Literals.MAIN_CHARACTER, PACKAGE, 0);
		public static final EcoreExecutorType _Npc = new EcoreExecutorType(Labyrinth_tales_of_gamersPackage.Literals.NPC, PACKAGE, 0);
		public static final EcoreExecutorType _Room = new EcoreExecutorType(Labyrinth_tales_of_gamersPackage.Literals.ROOM, PACKAGE, 0);

		private static final EcoreExecutorType /*@NonNull*/ [] types = {
			_Action,
			_Entity,
			_Game,
			_Hint,
			_MainCharacter,
			_Npc,
			_Room
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Labyrinth_tales_of_gamersTables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final ExecutorFragment _Action__Action = new ExecutorFragment(Types._Action, Labyrinth_tales_of_gamersTables.Types._Action);
		private static final ExecutorFragment _Action__OclAny = new ExecutorFragment(Types._Action, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Action__OclElement = new ExecutorFragment(Types._Action, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Entity__Entity = new ExecutorFragment(Types._Entity, Labyrinth_tales_of_gamersTables.Types._Entity);
		private static final ExecutorFragment _Entity__OclAny = new ExecutorFragment(Types._Entity, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Entity__OclElement = new ExecutorFragment(Types._Entity, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Game__Game = new ExecutorFragment(Types._Game, Labyrinth_tales_of_gamersTables.Types._Game);
		private static final ExecutorFragment _Game__OclAny = new ExecutorFragment(Types._Game, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Game__OclElement = new ExecutorFragment(Types._Game, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Hint__Entity = new ExecutorFragment(Types._Hint, Labyrinth_tales_of_gamersTables.Types._Entity);
		private static final ExecutorFragment _Hint__Hint = new ExecutorFragment(Types._Hint, Labyrinth_tales_of_gamersTables.Types._Hint);
		private static final ExecutorFragment _Hint__OclAny = new ExecutorFragment(Types._Hint, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Hint__OclElement = new ExecutorFragment(Types._Hint, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _MainCharacter__Entity = new ExecutorFragment(Types._MainCharacter, Labyrinth_tales_of_gamersTables.Types._Entity);
		private static final ExecutorFragment _MainCharacter__MainCharacter = new ExecutorFragment(Types._MainCharacter, Labyrinth_tales_of_gamersTables.Types._MainCharacter);
		private static final ExecutorFragment _MainCharacter__OclAny = new ExecutorFragment(Types._MainCharacter, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _MainCharacter__OclElement = new ExecutorFragment(Types._MainCharacter, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Npc__Entity = new ExecutorFragment(Types._Npc, Labyrinth_tales_of_gamersTables.Types._Entity);
		private static final ExecutorFragment _Npc__Npc = new ExecutorFragment(Types._Npc, Labyrinth_tales_of_gamersTables.Types._Npc);
		private static final ExecutorFragment _Npc__OclAny = new ExecutorFragment(Types._Npc, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Npc__OclElement = new ExecutorFragment(Types._Npc, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Room__OclAny = new ExecutorFragment(Types._Room, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Room__OclElement = new ExecutorFragment(Types._Room, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Room__Room = new ExecutorFragment(Types._Room, Labyrinth_tales_of_gamersTables.Types._Room);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Labyrinth_tales_of_gamersTables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Labyrinth_tales_of_gamersTables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Labyrinth_tales_of_gamersTables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}

		public static final ExecutorProperty _Action__label = new EcoreExecutorProperty(Labyrinth_tales_of_gamersPackage.Literals.ACTION__LABEL, Types._Action, 0);
		public static final ExecutorProperty _Action__Room__actions = new ExecutorPropertyWithImplementation("Room", Types._Action, 1, new EcoreLibraryOppositeProperty(Labyrinth_tales_of_gamersPackage.Literals.ROOM__ACTIONS));

		public static final ExecutorProperty _Entity__name = new EcoreExecutorProperty(Labyrinth_tales_of_gamersPackage.Literals.ENTITY__NAME, Types._Entity, 0);

		public static final ExecutorProperty _Game__epilogue = new EcoreExecutorProperty(Labyrinth_tales_of_gamersPackage.Literals.GAME__EPILOGUE, Types._Game, 0);
		public static final ExecutorProperty _Game__nbNpc = new EcoreExecutorProperty(Labyrinth_tales_of_gamersPackage.Literals.GAME__NB_NPC, Types._Game, 1);
		public static final ExecutorProperty _Game__player = new EcoreExecutorProperty(Labyrinth_tales_of_gamersPackage.Literals.GAME__PLAYER, Types._Game, 2);
		public static final ExecutorProperty _Game__prologue = new EcoreExecutorProperty(Labyrinth_tales_of_gamersPackage.Literals.GAME__PROLOGUE, Types._Game, 3);
		public static final ExecutorProperty _Game__rooms = new EcoreExecutorProperty(Labyrinth_tales_of_gamersPackage.Literals.GAME__ROOMS, Types._Game, 4);
		public static final ExecutorProperty _Game__title = new EcoreExecutorProperty(Labyrinth_tales_of_gamersPackage.Literals.GAME__TITLE, Types._Game, 5);

		public static final ExecutorProperty _Hint__currentRoom = new EcoreExecutorProperty(Labyrinth_tales_of_gamersPackage.Literals.HINT__CURRENT_ROOM, Types._Hint, 0);
		public static final ExecutorProperty _Hint__label = new EcoreExecutorProperty(Labyrinth_tales_of_gamersPackage.Literals.HINT__LABEL, Types._Hint, 1);
		public static final ExecutorProperty _Hint__npc = new EcoreExecutorProperty(Labyrinth_tales_of_gamersPackage.Literals.HINT__NPC, Types._Hint, 2);

		public static final ExecutorProperty _MainCharacter__currentRoom = new EcoreExecutorProperty(Labyrinth_tales_of_gamersPackage.Literals.MAIN_CHARACTER__CURRENT_ROOM, Types._MainCharacter, 0);
		public static final ExecutorProperty _MainCharacter__game = new EcoreExecutorProperty(Labyrinth_tales_of_gamersPackage.Literals.MAIN_CHARACTER__GAME, Types._MainCharacter, 1);
		public static final ExecutorProperty _MainCharacter__nbDiscoveredNpc = new EcoreExecutorProperty(Labyrinth_tales_of_gamersPackage.Literals.MAIN_CHARACTER__NB_DISCOVERED_NPC, Types._MainCharacter, 2);

		public static final ExecutorProperty _Npc__currentRoom = new EcoreExecutorProperty(Labyrinth_tales_of_gamersPackage.Literals.NPC__CURRENT_ROOM, Types._Npc, 0);
		public static final ExecutorProperty _Npc__discovered = new EcoreExecutorProperty(Labyrinth_tales_of_gamersPackage.Literals.NPC__DISCOVERED, Types._Npc, 1);
		public static final ExecutorProperty _Npc__helloSentence = new EcoreExecutorProperty(Labyrinth_tales_of_gamersPackage.Literals.NPC__HELLO_SENTENCE, Types._Npc, 2);
		public static final ExecutorProperty _Npc__hint = new EcoreExecutorProperty(Labyrinth_tales_of_gamersPackage.Literals.NPC__HINT, Types._Npc, 3);
		public static final ExecutorProperty _Npc__hintPosition = new EcoreExecutorProperty(Labyrinth_tales_of_gamersPackage.Literals.NPC__HINT_POSITION, Types._Npc, 4);
		public static final ExecutorProperty _Npc__invalidPropositionSentence = new EcoreExecutorProperty(Labyrinth_tales_of_gamersPackage.Literals.NPC__INVALID_PROPOSITION_SENTENCE, Types._Npc, 5);
		public static final ExecutorProperty _Npc__validPropositionSentence = new EcoreExecutorProperty(Labyrinth_tales_of_gamersPackage.Literals.NPC__VALID_PROPOSITION_SENTENCE, Types._Npc, 6);

		public static final ExecutorProperty _Room__actions = new EcoreExecutorProperty(Labyrinth_tales_of_gamersPackage.Literals.ROOM__ACTIONS, Types._Room, 0);
		public static final ExecutorProperty _Room__backendName = new EcoreExecutorProperty(Labyrinth_tales_of_gamersPackage.Literals.ROOM__BACKEND_NAME, Types._Room, 1);
		public static final ExecutorProperty _Room__east = new EcoreExecutorProperty(Labyrinth_tales_of_gamersPackage.Literals.ROOM__EAST, Types._Room, 2);
		public static final ExecutorProperty _Room__game = new EcoreExecutorProperty(Labyrinth_tales_of_gamersPackage.Literals.ROOM__GAME, Types._Room, 3);
		public static final ExecutorProperty _Room__hint = new EcoreExecutorProperty(Labyrinth_tales_of_gamersPackage.Literals.ROOM__HINT, Types._Room, 4);
		public static final ExecutorProperty _Room__name = new EcoreExecutorProperty(Labyrinth_tales_of_gamersPackage.Literals.ROOM__NAME, Types._Room, 5);
		public static final ExecutorProperty _Room__north = new EcoreExecutorProperty(Labyrinth_tales_of_gamersPackage.Literals.ROOM__NORTH, Types._Room, 6);
		public static final ExecutorProperty _Room__npc = new EcoreExecutorProperty(Labyrinth_tales_of_gamersPackage.Literals.ROOM__NPC, Types._Room, 7);
		public static final ExecutorProperty _Room__south = new EcoreExecutorProperty(Labyrinth_tales_of_gamersPackage.Literals.ROOM__SOUTH, Types._Room, 8);
		public static final ExecutorProperty _Room__west = new EcoreExecutorProperty(Labyrinth_tales_of_gamersPackage.Literals.ROOM__WEST, Types._Room, 9);
		public static final ExecutorProperty _Room__MainCharacter__currentRoom = new ExecutorPropertyWithImplementation("MainCharacter", Types._Room, 10, new EcoreLibraryOppositeProperty(Labyrinth_tales_of_gamersPackage.Literals.MAIN_CHARACTER__CURRENT_ROOM));
		public static final ExecutorProperty _Room__Npc__hintPosition = new ExecutorPropertyWithImplementation("Npc", Types._Room, 11, new EcoreLibraryOppositeProperty(Labyrinth_tales_of_gamersPackage.Literals.NPC__HINT_POSITION));
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Labyrinth_tales_of_gamersTables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final ExecutorFragment /*@NonNull*/ [] _Action =
			{
				Fragments._Action__OclAny /* 0 */,
				Fragments._Action__OclElement /* 1 */,
				Fragments._Action__Action /* 2 */
			};
		private static final int /*@NonNull*/ [] __Action = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Entity =
			{
				Fragments._Entity__OclAny /* 0 */,
				Fragments._Entity__OclElement /* 1 */,
				Fragments._Entity__Entity /* 2 */
			};
		private static final int /*@NonNull*/ [] __Entity = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Game =
			{
				Fragments._Game__OclAny /* 0 */,
				Fragments._Game__OclElement /* 1 */,
				Fragments._Game__Game /* 2 */
			};
		private static final int /*@NonNull*/ [] __Game = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Hint =
			{
				Fragments._Hint__OclAny /* 0 */,
				Fragments._Hint__OclElement /* 1 */,
				Fragments._Hint__Entity /* 2 */,
				Fragments._Hint__Hint /* 3 */
			};
		private static final int /*@NonNull*/ [] __Hint = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _MainCharacter =
			{
				Fragments._MainCharacter__OclAny /* 0 */,
				Fragments._MainCharacter__OclElement /* 1 */,
				Fragments._MainCharacter__Entity /* 2 */,
				Fragments._MainCharacter__MainCharacter /* 3 */
			};
		private static final int /*@NonNull*/ [] __MainCharacter = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Npc =
			{
				Fragments._Npc__OclAny /* 0 */,
				Fragments._Npc__OclElement /* 1 */,
				Fragments._Npc__Entity /* 2 */,
				Fragments._Npc__Npc /* 3 */
			};
		private static final int /*@NonNull*/ [] __Npc = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Room =
			{
				Fragments._Room__OclAny /* 0 */,
				Fragments._Room__OclElement /* 1 */,
				Fragments._Room__Room /* 2 */
			};
		private static final int /*@NonNull*/ [] __Room = { 1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Action.initFragments(_Action, __Action);
			Types._Entity.initFragments(_Entity, __Entity);
			Types._Game.initFragments(_Game, __Game);
			Types._Hint.initFragments(_Hint, __Hint);
			Types._MainCharacter.initFragments(_MainCharacter, __MainCharacter);
			Types._Npc.initFragments(_Npc, __Npc);
			Types._Room.initFragments(_Room, __Room);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Labyrinth_tales_of_gamersTables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final ExecutorOperation /*@NonNull*/ [] _Action__Action = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Action__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Action__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Entity__Entity = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Entity__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Entity__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Game__Game = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Game__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Game__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Hint__Hint = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Hint__Entity = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Hint__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Hint__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _MainCharacter__MainCharacter = {};
		private static final ExecutorOperation /*@NonNull*/ [] _MainCharacter__Entity = {};
		private static final ExecutorOperation /*@NonNull*/ [] _MainCharacter__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _MainCharacter__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Npc__Npc = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Npc__Entity = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Npc__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Npc__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Room__Room = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Room__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Room__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Action__Action.initOperations(_Action__Action);
			Fragments._Action__OclAny.initOperations(_Action__OclAny);
			Fragments._Action__OclElement.initOperations(_Action__OclElement);

			Fragments._Entity__Entity.initOperations(_Entity__Entity);
			Fragments._Entity__OclAny.initOperations(_Entity__OclAny);
			Fragments._Entity__OclElement.initOperations(_Entity__OclElement);

			Fragments._Game__Game.initOperations(_Game__Game);
			Fragments._Game__OclAny.initOperations(_Game__OclAny);
			Fragments._Game__OclElement.initOperations(_Game__OclElement);

			Fragments._Hint__Entity.initOperations(_Hint__Entity);
			Fragments._Hint__Hint.initOperations(_Hint__Hint);
			Fragments._Hint__OclAny.initOperations(_Hint__OclAny);
			Fragments._Hint__OclElement.initOperations(_Hint__OclElement);

			Fragments._MainCharacter__Entity.initOperations(_MainCharacter__Entity);
			Fragments._MainCharacter__MainCharacter.initOperations(_MainCharacter__MainCharacter);
			Fragments._MainCharacter__OclAny.initOperations(_MainCharacter__OclAny);
			Fragments._MainCharacter__OclElement.initOperations(_MainCharacter__OclElement);

			Fragments._Npc__Entity.initOperations(_Npc__Entity);
			Fragments._Npc__Npc.initOperations(_Npc__Npc);
			Fragments._Npc__OclAny.initOperations(_Npc__OclAny);
			Fragments._Npc__OclElement.initOperations(_Npc__OclElement);

			Fragments._Room__OclAny.initOperations(_Room__OclAny);
			Fragments._Room__OclElement.initOperations(_Room__OclElement);
			Fragments._Room__Room.initOperations(_Room__Room);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Labyrinth_tales_of_gamersTables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final ExecutorProperty /*@NonNull*/ [] _Action = {
			Labyrinth_tales_of_gamersTables.Properties._Action__label,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Entity = {
			Labyrinth_tales_of_gamersTables.Properties._Entity__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Game = {
			Labyrinth_tales_of_gamersTables.Properties._Game__epilogue,
			Labyrinth_tales_of_gamersTables.Properties._Game__nbNpc,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Labyrinth_tales_of_gamersTables.Properties._Game__player,
			Labyrinth_tales_of_gamersTables.Properties._Game__prologue,
			Labyrinth_tales_of_gamersTables.Properties._Game__rooms,
			Labyrinth_tales_of_gamersTables.Properties._Game__title
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Hint = {
			Labyrinth_tales_of_gamersTables.Properties._Hint__currentRoom,
			Labyrinth_tales_of_gamersTables.Properties._Hint__label,
			Labyrinth_tales_of_gamersTables.Properties._Entity__name,
			Labyrinth_tales_of_gamersTables.Properties._Hint__npc,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _MainCharacter = {
			Labyrinth_tales_of_gamersTables.Properties._MainCharacter__currentRoom,
			Labyrinth_tales_of_gamersTables.Properties._MainCharacter__game,
			Labyrinth_tales_of_gamersTables.Properties._Entity__name,
			Labyrinth_tales_of_gamersTables.Properties._MainCharacter__nbDiscoveredNpc,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Npc = {
			Labyrinth_tales_of_gamersTables.Properties._Npc__currentRoom,
			Labyrinth_tales_of_gamersTables.Properties._Npc__discovered,
			Labyrinth_tales_of_gamersTables.Properties._Npc__helloSentence,
			Labyrinth_tales_of_gamersTables.Properties._Npc__hint,
			Labyrinth_tales_of_gamersTables.Properties._Npc__hintPosition,
			Labyrinth_tales_of_gamersTables.Properties._Npc__invalidPropositionSentence,
			Labyrinth_tales_of_gamersTables.Properties._Entity__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Labyrinth_tales_of_gamersTables.Properties._Npc__validPropositionSentence
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Room = {
			Labyrinth_tales_of_gamersTables.Properties._Room__actions,
			Labyrinth_tales_of_gamersTables.Properties._Room__backendName,
			Labyrinth_tales_of_gamersTables.Properties._Room__east,
			Labyrinth_tales_of_gamersTables.Properties._Room__game,
			Labyrinth_tales_of_gamersTables.Properties._Room__hint,
			Labyrinth_tales_of_gamersTables.Properties._Room__name,
			Labyrinth_tales_of_gamersTables.Properties._Room__north,
			Labyrinth_tales_of_gamersTables.Properties._Room__npc,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Labyrinth_tales_of_gamersTables.Properties._Room__south,
			Labyrinth_tales_of_gamersTables.Properties._Room__west
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Action__Action.initProperties(_Action);
			Fragments._Entity__Entity.initProperties(_Entity);
			Fragments._Game__Game.initProperties(_Game);
			Fragments._Hint__Hint.initProperties(_Hint);
			Fragments._MainCharacter__MainCharacter.initProperties(_MainCharacter);
			Fragments._Npc__Npc.initProperties(_Npc);
			Fragments._Room__Room.initProperties(_Room);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Labyrinth_tales_of_gamersTables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Labyrinth_tales_of_gamersTables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual construction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual construction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {
		new Labyrinth_tales_of_gamersTables();
	}

	private Labyrinth_tales_of_gamersTables() {
		super(Labyrinth_tales_of_gamersPackage.eNS_URI);
	}
}
