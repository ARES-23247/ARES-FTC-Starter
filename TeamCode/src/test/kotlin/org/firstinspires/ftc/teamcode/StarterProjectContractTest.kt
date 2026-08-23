// ARES OWNERSHIP: GENERATED STARTER
package org.firstinspires.ftc.teamcode

import org.firstinspires.ftc.teamcode.generated.GeneratedAresProject
import org.firstinspires.ftc.teamcode.generated.drivebase.GeneratedAresDrivebaseConfig
import org.junit.Assert.assertTrue
import org.junit.Test

class StarterProjectContractTest {
    @Test
    fun generatedProjectAlwaysKeepsTheExplicitNeutralRecoveryPath() {
        assertTrue("drivetrain.recoverNeutral" in GeneratedAresProject.knownActionKeys)
        assertTrue(GeneratedAresProject.knownActionKeys.all(String::isNotBlank))
    }

    @Test
    fun generatedMecanumDrivebaseKeepsFourDistinctMotorsAndSupportedLocalization() {
        val motorHardwareIds = listOf(
            GeneratedAresDrivebaseConfig.Components.FTC_MOTOR_FL.HARDWARE_ID,
            GeneratedAresDrivebaseConfig.Components.FTC_MOTOR_FR.HARDWARE_ID,
            GeneratedAresDrivebaseConfig.Components.FTC_MOTOR_RL.HARDWARE_ID,
            GeneratedAresDrivebaseConfig.Components.FTC_MOTOR_RR.HARDWARE_ID,
        )
        assertTrue(motorHardwareIds.all(String::isNotBlank))
        assertTrue(motorHardwareIds.distinct().size == 4)
        assertTrue(
            GeneratedAresDrivebaseConfig.Localization.PRIMARY_ODOMETRY.KIND in
                setOf("WHEEL_ENCODERS_IMU", "PINPOINT"),
        )
        assertTrue(GeneratedAresDrivebaseConfig.Localization.PRIMARY_ODOMETRY.COMPONENT_UIDS.isNotEmpty())
    }
}
