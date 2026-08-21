# ARES FTC Zero-Code Starter

This is the generic, simulation-first FTC project created by ARES Analytics. It is deliberately
separate from Team 23247's `ARES-FTC` season robot so a new team starts without inherited mechanisms,
field assets, routines, hardware constants, or calibration values.

## First run

1. Open this folder in ARES Analytics.
2. Set your team, season, and robot name in **Project Identity**.
3. Review the four motors and IMU in **Drivebase Builder**.
4. Import or create the season field and AprilTags in **Field Studio**.
5. Add mechanisms in **Subsystem Builder** and map controls in **Controller Bindings**.
6. Select **Verify & build**, then practice with **Local Simulator**.
7. Complete **Hardware Setup** with a mentor before physical deployment.

The initial robot has four required motors named `fl`, `fr`, `rl`, and `rr`, plus the Control Hub IMU
named `imu`. Wheel encoders and the IMU provide the generic localization path. The tuning profile is
an uncalibrated simulation baseline, not a claim about a physical robot.

```powershell
# Focused local development against a sibling ARESLib checkout
.\gradlew.bat generateAresProject verifyAresProject :TeamCode:testDebugUnitTest :simulator:test :TeamCode:assembleDebug -ParesUseSiblingLib=true

# Normal released-artifact build
.\gradlew.bat generateAresProject verifyAresProject :TeamCode:testDebugUnitTest :simulator:test :TeamCode:assembleDebug
```

See [docs/STARTER_ARCHITECTURE.md](docs/STARTER_ARCHITECTURE.md) and
[docs/PHYSICAL_COMMISSIONING.md](docs/PHYSICAL_COMMISSIONING.md). Field and camera setup is covered
in [docs/APRILTAG_FIELDS.md](docs/APRILTAG_FIELDS.md).
