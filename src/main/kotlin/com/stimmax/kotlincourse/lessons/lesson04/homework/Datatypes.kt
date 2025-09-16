package com.stimmax.kotlincourse.lessons.lesson04.homework

class Datatypes {
    val v1: Byte = 42
    val v2: Long = 98765432123456789L
    val v3: Float = 23.45f
    val v4: Double = 0.123456789
    val v5: String = "Kotlin & Java"
    //val v6 = FALSE ошибка, для boolean указываем false, для String берем в кавычки "FALSE"
    val v7: Char = 'c'
    val v8: Short = 500
    val v9: Long = 4294967296L
    val v10: Float = 18.0f
    val v11: Double = -0.001
    val v12: String = "OpenAI"
    val v13: String = "true"
    val v14: List<Byte> = listOf(3, 14)
    val v15: Char = '9'
    val v16: Short = 2048
    val v17: Long = 10000000000L
    val v18: Set<String> = setOf("OpenAI", "Quantum Computing")
    val v19: Float = 5.75f
    //val v20 = `1.414` некорректное задание переменной
    val v21: String = "Artificial Intelligence"
    val v22: Array<Any> = arrayOf('x', "A")
    val v23: String = "Android Studio"
    val v24: Char = '@'
    val v25: Short = 1024
    val v26: Long = 1234567890123L
    val v27: Float = 10.01f
    val v28: Double = -273.15
    val v29: String = "SpaceX"
    //val v30 = FALSE ошибка, для boolean указываем false, для String берем в кавычки "FALSE"
    val v31: Double = 0.007
    //val v32 = “🤯” ошибка
    val v33: Map<String, Int> = mapOf("true" to 2, "false" to 34)
    //val v34 = ‘65535’ ошибка
    val v35: Long = 72057594037927935L
    val v36: Float = 2.71828f
    val v37: Double = 101.0101
    val v38: String = "Quantum Computing"
    val v39: Map<Int, String> = mapOf(2 to "true", 34 to "false")
    val v40: Char = 'x'
    val v41: Short = 314
    val v42: Long = 123456789123456789L
    val v43: Float = 6.626f
    //val v44 = TRUE ошибка, для boolean указываем true, для String берем в кавычки "TRUE"

//    Подбери подходящий тип который будет:
//
//    Хранить букву, на которую указывает палец медиума во время спиритического сеанса.
    val letter: Char = 'N'

//    Хранить количество ложек сахара, которые я кладу в одну чашку чая.
    val spoonsOfSugar: Byte = 2

//    Хранить список расходов на доставку еды, чтобы ещё раз убедиться, что готовить было дешевле.
    val foodPrice: List<Double> = listOf(1020.99, 3459.99, 4300.50)

//    Хранить длину очереди в столовой до миллиардной доли сантиметра.
    var length: Double = 4793749.855989

//    Хранить факт, закрыт ли баг после того, как его просто переименовали в фичу.
    val isDefectClosed: Boolean = true

//    Хранить количество свистков чайника за день.
    val whistKettleCount: Short = 129

//    Хранить количество нажатий котом на клавиатуру ноутбука за всё время твоей работы.
    val catPressKeyboardCount: Int = 65787

//    Хранить количество попыток пересчитать звёзды на небе за всю историю человечества.
    val starsCount: Long = 468740850474578L

//    Хранить массу воздуха в спускающем матрасе после нападения кота в долях грамма.
    val airWeight: Float = 67.8f

//    Хранить словарь «название стартапа → сумму потерь инвесторов».
    val startupToLoose: Map<String, Double> = mapOf("Name1" to 463874487.57, "Name2" to 750370375.58)

//    Хранить строку «починилось само», чтобы закрывать тикеты без лишних слов.
    val strToReasonTaskClosed: String = "починилось само"

//    Хранить список тем для митингов, которые на самом деле никому не нужны.
    val meetingThemes: List<String> = listOf("Daily", "Retro", "PBR", "Demo")

}