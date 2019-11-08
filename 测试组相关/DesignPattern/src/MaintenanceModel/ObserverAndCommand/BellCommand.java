package MaintenanceModel.ObserverAndCommand;

//响铃命令类
abstract class BellCommand extends Command{
    Bell bell = new Bell();
}

//短响铃
class AlarmShort extends BellCommand {
    @Override
    void execute() {
        bell.shortBell();
    }
}

//长响铃
class AlarmLong extends BellCommand {
    @Override
    void execute() {
        bell.longBell();
    }
}
