@file:Suppress("MagicNumber", "LongMethod")

package org.firstinspires.ftc.teamcode.generated

import com.areslib.codegen.CapabilityArgumentReader
import com.areslib.routine.AutonomousCatalogEntry
import com.areslib.routine.RoutineDocument
import com.areslib.routine.RoutineDriveMarker
import com.areslib.routine.RoutineDriveStep
import com.areslib.routine.RoutinePose
import com.areslib.routine.RoutineRuntimeBindings
import com.areslib.routine.RoutineStep
import com.areslib.routine.RoutineStepKind
import com.areslib.routine.RoutineManager
import com.areslib.input.ControllerBindingRuntime
import com.areslib.routine.RoutineStartPolicy
import com.areslib.input.AnalogBinding
import com.areslib.input.AnalogBindingListener
import com.areslib.input.AnalogEmissionPolicy
import com.areslib.input.AnalogZone
import com.areslib.input.AnalogZoneListener
import com.areslib.input.AxisThresholdSource
import com.areslib.input.AxisTransform
import com.areslib.input.BindingReleaseReason
import com.areslib.input.ButtonSuppressionState
import com.areslib.input.ChordSource
import com.areslib.input.DigitalBinding
import com.areslib.input.DigitalBindingListener
import com.areslib.input.DigitalBindingTiming
import com.areslib.input.RawButtonSource
import com.areslib.input.SuppressibleButtonSource
import com.areslib.input.SuppressingButtonChordSource
import com.areslib.input.ThresholdDirection
import com.areslib.sequencer.Task
import com.areslib.state.RobotState

/** Stable robot boundary for capabilities referenced by generated project documents. */
interface GeneratedAresProjectCapabilities {
    /** Creates a hand-authored or season action by its catalog key, or null when unavailable. */
    fun createActionTask(actionKey: String, arguments: Map<String, String>): Task? = null

    /**
     * Receives the combined teleop drivetrain command once per frame. Values are normalized
     * (-1..1) after each axis binding's transform, field-centric with CCW-positive rotation;
     * the implementation scales them by drivetrain limits and applies alliance mirroring.
     * [active] is false when the scheme has no drive bindings, so sinks without generated
     * drivetrain control stay inert.
     */
    fun onDriveCommand(vx: Double, vy: Double, omega: Double, active: Boolean) = Unit

    /** Creates a hand-authored condition predicate by its catalog key, or null when unavailable. */
    fun createCondition(conditionKey: String, arguments: Map<String, String>): ((RobotState) -> Boolean)? = null

    /** Platform trajectory adapter; returning null rejects a drive step safely. */
    fun createDriveTask(step: RoutineDriveStep): Task? = null
}

/** Robot scheduler boundary used by generated direct-action controller bindings. */
fun interface GeneratedAresProjectControlTaskSink {
    fun submit(bindingId: String, task: Task)
}

/** Generated from the project's checked-in ARES documents. Do not edit by hand. */
object GeneratedAresProject {
    const val GENERATOR_VERSION: Int = 8
    const val CATALOG_SHA256: String = "b8ec83088f31b08338640767d4d2889a9331e402fa9ae2a17f30994308d2b934"
    const val CONTENT_SHA256: String = "d8f9f73ef44d7c107293add8624d9fcaf9c19b2abad95a02c7f82e30053fc0ec"
    const val SOURCE_SHA256: String = "24f990e219de1d462b11407efc83e81698fe83408f1cba496354179e1c3f8c5e"

    const val PROJECT_ID: String = "ares-ftc-starter"
    const val PROJECT_LEAGUE: String = "FTC"
    const val COORDINATE_CONVENTION: String = "CENTER_ORIGIN_CCW"
    const val ROBOT_LENGTH_METERS: Double = 0.45
    const val ROBOT_WIDTH_METERS: Double = 0.45
    const val FIELD_LENGTH_METERS: Double = 3.6576
    const val FIELD_WIDTH_METERS: Double = 3.6576

    /** Canonical runtime choices reviewed in .ares/project.json. */
    object RuntimeOptions {
        const val FTC_HUB_COMMAND_TRANSPORT: String = "STANDARD_SDK"
        const val FTC_LIMELIGHT_PROXY_ENABLED: Boolean = false
    }

    val knownActionKeys: Set<String> = setOf("drivetrain.headingLock.disable", "drivetrain.headingLock.enable", "drivetrain.headingLock.toggle", "drivetrain.positionHold.disable", "drivetrain.positionHold.enable", "drivetrain.positionHold.toggle", "drivetrain.recoverNeutral")
    val knownConditionKeys: Set<String> = emptySet()

    val routines: Map<String, RoutineDocument> = linkedMapOf()

    val autonomousEntries: List<AutonomousCatalogEntry> = emptyList()
    val DEFAULT_AUTONOMOUS_ENTRY_ID: String? = null

    fun runtimeBindings(registry: GeneratedAresProjectCapabilities): RoutineRuntimeBindings =
        RoutineRuntimeBindings(
            createActionTask = { key, arguments ->
                when (key) {
                    "drivetrain.headingLock.disable" -> {
                        CapabilityArgumentReader(
                            capabilityKey = "drivetrain.headingLock.disable",
                            arguments = arguments,
                            allowedKeys = emptySet(),
                        )
                        registry.createActionTask(key, arguments)
                    }
                    "drivetrain.headingLock.enable" -> {
                        CapabilityArgumentReader(
                            capabilityKey = "drivetrain.headingLock.enable",
                            arguments = arguments,
                            allowedKeys = emptySet(),
                        )
                        registry.createActionTask(key, arguments)
                    }
                    "drivetrain.headingLock.toggle" -> {
                        CapabilityArgumentReader(
                            capabilityKey = "drivetrain.headingLock.toggle",
                            arguments = arguments,
                            allowedKeys = emptySet(),
                        )
                        registry.createActionTask(key, arguments)
                    }
                    "drivetrain.positionHold.disable" -> {
                        CapabilityArgumentReader(
                            capabilityKey = "drivetrain.positionHold.disable",
                            arguments = arguments,
                            allowedKeys = emptySet(),
                        )
                        registry.createActionTask(key, arguments)
                    }
                    "drivetrain.positionHold.enable" -> {
                        CapabilityArgumentReader(
                            capabilityKey = "drivetrain.positionHold.enable",
                            arguments = arguments,
                            allowedKeys = emptySet(),
                        )
                        registry.createActionTask(key, arguments)
                    }
                    "drivetrain.positionHold.toggle" -> {
                        CapabilityArgumentReader(
                            capabilityKey = "drivetrain.positionHold.toggle",
                            arguments = arguments,
                            allowedKeys = emptySet(),
                        )
                        registry.createActionTask(key, arguments)
                    }
                    "drivetrain.recoverNeutral" -> {
                        CapabilityArgumentReader(
                            capabilityKey = "drivetrain.recoverNeutral",
                            arguments = arguments,
                            allowedKeys = emptySet(),
                        )
                        registry.createActionTask(key, arguments)
                    }
                    else -> null
                }
            },
            createCondition = { _, _ -> null },
            createDriveTask = registry::createDriveTask,
            isActionKnown = knownActionKeys::contains,
            isConditionKnown = knownConditionKeys::contains,
            resourcesForAction = { key ->
                when (key) {
                    "drivetrain.headingLock.disable" -> setOf("drivetrain")
                    "drivetrain.headingLock.enable" -> setOf("drivetrain")
                    "drivetrain.headingLock.toggle" -> setOf("drivetrain")
                    "drivetrain.positionHold.disable" -> setOf("drivetrain")
                    "drivetrain.positionHold.enable" -> setOf("drivetrain")
                    "drivetrain.positionHold.toggle" -> setOf("drivetrain")
                    "drivetrain.recoverNeutral" -> setOf("drivetrain")
                    else -> emptySet()
                }
            },
        )

    val knownControlSchemeIds: Set<String> = setOf("driver")
    val DEFAULT_CONTROL_SCHEME_ID: String? = "driver"

    /** True when the active scheme binds at least one drivetrain axis. */
    val HAS_GENERATED_DRIVE_BINDINGS: Boolean = true
    private val driveAxisValues = DoubleArray(3)

    /**
     * Publishes the latest drive-axis listener values as one combined command. Disconnects emit
     * zeros and the analog rearm policy holds that neutral until every axis passes through its
     * deadband, so a deflected stick cannot lurch the robot across a controller reconnect.
     */
    fun emitDriveCommand(registry: GeneratedAresProjectCapabilities) {
        registry.onDriveCommand(driveAxisValues[0], driveAxisValues[1], driveAxisValues[2], HAS_GENERATED_DRIVE_BINDINGS)
    }

    /**
     * Builds one allocation-free update runtime per zero-based Driver Station port. Suppressing chords are
     * ordered before constituent buttons and raise their effective press debounce to the chord
     * window, preventing a near-simultaneous chord from leaking a single-button action.
     */
    @Suppress("UNUSED_PARAMETER")
    fun createControllerRuntimes(
        schemeId: String?,
        registry: GeneratedAresProjectCapabilities,
        routineManager: RoutineManager,
        taskSink: GeneratedAresProjectControlTaskSink,
    ): Map<Int, ControllerBindingRuntime> {
        val activeSchemeId = requireNotNull(schemeId) { "A generated control scheme is required" }
        return when (activeSchemeId) {
        "driver" -> run {
            val buttonSuppression_driver_b4def821 = ButtonSuppressionState(buttonCapacity = 128)
            val suppressingChord_recover_drive_neutral_66a0898c = SuppressingButtonChordSource(
                buttonIndexes = intArrayOf(6, 7),
                simultaneityWindowNanos = 150000000L,
                suppression = buttonSuppression_driver_b4def821,
            )

            linkedMapOf(
                0 to ControllerBindingRuntime(
                    digitalBindings = listOf(
                        DigitalBinding(
                            source = suppressingChord_recover_drive_neutral_66a0898c,
                            timing = DigitalBindingTiming(
                                pressDebounceNanos = 100000000L,
                                releaseDebounceNanos = 100000000L,
                                holdAfterNanos = -1L,
                                repeatAfterNanos = -1L,
                                repeatEveryNanos = 0L,
                                cooldownNanos = 1000000000L,
                                maximumActiveNanos = -1L,
                            ),
                            listener = object : DigitalBindingListener {
                                override fun onPress() {
                                    taskSink.submit(
                                        bindingId = "recover-drive-neutral",
                                        task = requireNotNull(registry.createActionTask("drivetrain.recoverNeutral", emptyMap())) { "Generated action 'drivetrain.recoverNeutral' is unavailable at runtime" },
                                    )
                                }
                            },
                        ),
                    ),
                    analogBindings = listOf(
                        AnalogBinding(
                            axisIndex = 1,
                            transform = AxisTransform(
                                inputMin = -1.0,
                                inputCenter = 0.0,
                                inputMax = 1.0,
                                deadband = 0.05,
                                exponent = 1.0,
                                inverted = true,
                                outputMin = -1.0,
                                outputMax = 1.0,
                            ),
                            listener = object : AnalogBindingListener {
                                override fun onValue(value: Double) {
                                    driveAxisValues[0] = value
                                }
                            },
                            zones = emptyList(),
                            emissionPolicy = AnalogEmissionPolicy.EVERY_UPDATE,
                            changeEpsilon = 1.0E-6,
                            riseRatePerSecond = Double.POSITIVE_INFINITY,
                            fallRatePerSecond = Double.POSITIVE_INFINITY,
                            rearmNeutralThreshold = 0.05,
                        ),
                        AnalogBinding(
                            axisIndex = 2,
                            transform = AxisTransform(
                                inputMin = -1.0,
                                inputCenter = 0.0,
                                inputMax = 1.0,
                                deadband = 0.05,
                                exponent = 1.0,
                                inverted = true,
                                outputMin = -1.0,
                                outputMax = 1.0,
                            ),
                            listener = object : AnalogBindingListener {
                                override fun onValue(value: Double) {
                                    driveAxisValues[2] = value
                                }
                            },
                            zones = emptyList(),
                            emissionPolicy = AnalogEmissionPolicy.EVERY_UPDATE,
                            changeEpsilon = 1.0E-6,
                            riseRatePerSecond = Double.POSITIVE_INFINITY,
                            fallRatePerSecond = Double.POSITIVE_INFINITY,
                            rearmNeutralThreshold = 0.05,
                        ),
                        AnalogBinding(
                            axisIndex = 0,
                            transform = AxisTransform(
                                inputMin = -1.0,
                                inputCenter = 0.0,
                                inputMax = 1.0,
                                deadband = 0.05,
                                exponent = 1.0,
                                inverted = true,
                                outputMin = -1.0,
                                outputMax = 1.0,
                            ),
                            listener = object : AnalogBindingListener {
                                override fun onValue(value: Double) {
                                    driveAxisValues[1] = value
                                }
                            },
                            zones = emptyList(),
                            emissionPolicy = AnalogEmissionPolicy.EVERY_UPDATE,
                            changeEpsilon = 1.0E-6,
                            riseRatePerSecond = Double.POSITIVE_INFINITY,
                            fallRatePerSecond = Double.POSITIVE_INFINITY,
                            rearmNeutralThreshold = 0.05,
                        ),
                    ),
                ),
            )
        }
            else -> throw IllegalArgumentException("Unknown control scheme '$activeSchemeId'")
        }
    }
}
