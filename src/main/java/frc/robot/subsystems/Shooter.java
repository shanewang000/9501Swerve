package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.VictorSP;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;


public class Shooter extends SubsystemBase{
    //private CANSparkMax shooter = new CANSparkMax(0, MotorType.kBrushless);
    private VictorSP shooterL = new VictorSP(Constants.ShooterConstants.kShooterMotorPortL);
    private VictorSP shooterR = new VictorSP(Constants.ShooterConstants.kShooterMotorPortR);


    private double speed = Constants.ShooterConstants.speed;

    public Shooter(){
        shooterL.isSafetyEnabled();
        shooterR.isSafetyEnabled();
    }

    public void stopMotor(){
        shooterL.stopMotor();
        shooterR.stopMotor();
    }


    public void set(double speed){
        this.speed = speed;
        shooterL.set(speed);
        shooterR.set(-speed);
    }

    @Override
    public void periodic(){
        //System.out.println("shooterSpd:" + this.speed);
    }
}
