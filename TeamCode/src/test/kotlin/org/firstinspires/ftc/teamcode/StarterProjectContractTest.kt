// ARES OWNERSHIP: GENERATED STARTER
package org.firstinspires.ftc.teamcode

import org.firstinspires.ftc.teamcode.generated.GeneratedAresProject
import org.firstinspires.ftc.teamcode.generated.drivebase.GeneratedAresDrivebaseConfig
import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class StarterProjectContractTest {
    @Test
    fun genericProjectHasOnlyTheSafeStarterActionAndNoAutonomousRoutine() {
        assertEquals(setOf("drivetrain.recoverNeutral"), GeneratedAresProject.knownActionKeys)
        assertTrue(GeneratedAresProject.routines.isEmpty())
        assertTrue(GeneratedAresProject.autonomousEntries.isEmpty())
    }

    @Test
    fun genericDrivebaseUsesFourNamedMotorsAndWheelImuLocalization() {
        assertEquals("fl", GeneratedAresDrivebaseConfig.Components.FTC_MOTOR_FL.HARDWARE_ID)
        assertEquals("fr", GeneratedAresDrivebaseConfig.Components.FTC_MOTOR_FR.HARDWARE_ID)
        assertEquals("rl", GeneratedAresDrivebaseConfig.Components.FTC_MOTOR_RL.HARDWARE_ID)
        assertEquals("rr", GeneratedAresDrivebaseConfig.Components.FTC_MOTOR_RR.HARDWARE_ID)
        assertEquals("imu", GeneratedAresDrivebaseConfig.Components.FTC_LOCALIZATION_IMU.HARDWARE_ID)
        assertEquals("WHEEL_ENCODERS_IMU", GeneratedAresDrivebaseConfig.Localization.PRIMARY_ODOMETRY.KIND)
        assertTrue(GeneratedAresDrivebaseConfig.Components.FTC_LOCALIZATION_IMU.REQUIRED)
        assertFalse(GeneratedAresDrivebaseConfig.Localization.PRIMARY_ODOMETRY.COMPONENT_UIDS.isEmpty())
    }
}
