import TimeInterval.*

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int)

enum class TimeInterval { DAY, WEEK, YEAR }

operator fun MyDate.plus(timeInterval: TimeInterval): MyDate = this.addTimeIntervals(timeInterval,1)

class RepeatTimeInterval(val timeInterval: TimeInterval,val count:Int)

operator fun TimeInterval.times(count: Int) = RepeatTimeInterval(this,count)

operator fun MyDate.plus(repeatTimeInterval: RepeatTimeInterval): MyDate = this.addTimeIntervals(repeatTimeInterval.timeInterval,repeatTimeInterval.count)

fun task1(today: MyDate): MyDate {
    return today + YEAR + WEEK
}

fun task2(today: MyDate): MyDate {
    return today + YEAR * 2 + WEEK * 3 + DAY * 5
}