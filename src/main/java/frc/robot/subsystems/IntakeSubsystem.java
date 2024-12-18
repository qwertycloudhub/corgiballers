package frc.robot.subsystems;


import com.ctre.phoenix6.hardware.TalonFX;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class IntakeSubsystem extends SubsystemBase {


    private static int INTAKE_ID = 0;

    private static final TalonFX intakeMotor = new TalonFX(INTAKE_ID);

    private static double ROLL_IN_POWER = 0;

    private void stop() {
         intakeMotor.stopMotor();
    }

    private void setIntakeSpeed(double speed) {
        intakeMotor.set(speed);
    }

    private Command roll(double vel){return startEnd(() -> setIntakeSpeed(vel), this::stop);}

    public Command rollIn(double vel){
        return roll(vel);
    }
}