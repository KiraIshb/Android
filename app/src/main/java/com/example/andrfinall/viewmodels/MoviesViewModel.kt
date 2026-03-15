package com.example.andrfinall.viewmodels

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.andrfinall.models.Movie

class MoviesViewModel : ViewModel() {

    var movies by mutableStateOf<List<Movie>>(emptyList())
        private set

    init {
        loadMovies()
    }

    private fun loadMovies() {
        movies = listOf(
            Movie(
                id = 1,
                title = "Побег из Шоушенка",
                genres = listOf("Драма"),
                description = "Бухгалтер Энди Дюфрейн обвинён в убийстве собственной жены и её любовника. Оказавшись в тюрьме под названием Шоушенк, он сталкивается с жестокостью и беззаконием, царящими по обе стороны решётки.",
                year = 1994,
                countries = listOf("США"),
                actors = listOf("Тим Роббинс", "Морган Фриман", "Боб Гантон"),
                director = "Фрэнк Дарабонт",
                duration = 142,
                rating = 9.3
            ),
            Movie(
                id = 2,
                title = "Крёстный отец",
                genres = listOf("Драма", "Криминал"),
                description = "Криминальная сага, повествующая о нью-йоркской сицилийской мафиозной семье Корлеоне. Дон Вито Корлеоне пытается передать управление своему сыну Майклу.",
                year = 1972,
                countries = listOf("США"),
                actors = listOf("Марлон Брандо", "Аль Пачино", "Джеймс Каан"),
                director = "Фрэнсис Форд Коппола",
                duration = 175,
                rating = 9.2
            ),
            Movie(
                id = 3,
                title = "Тёмный рыцарь",
                genres = listOf("Боевик", "Драма", "Криминал"),
                description = "Бэтмен поднимает ставки в войне с криминалом. С помощью лейтенанта Джима Гордона и прокурора Харви Дента он намерен очистить улицы Готэма от преступности.",
                year = 2008,
                countries = listOf("США", "Великобритания"),
                actors = listOf("Кристиан Бэйл", "Хит Леджер", "Аарон Экхарт"),
                director = "Кристофер Нолан",
                duration = 152,
                rating = 9.0
            ),
            Movie(
                id = 4,
                title = "Криминальное чтиво",
                genres = listOf("Криминал", "Драма"),
                description = "Несколько связанных историй из жизни бандитов и мелких преступников. Джулс и Винсент, два наёмных убийцы, работают на босса Марселласа Уоллеса.",
                year = 1994,
                countries = listOf("США"),
                actors = listOf("Джон Траволта", "Ума Турман", "Сэмюэл Л. Джексон"),
                director = "Квентин Тарантино",
                duration = 154,
                rating = 8.9
            ),
            Movie(
                id = 5,
                title = "Властелин колец: Возвращение короля",
                genres = listOf("Фэнтези", "Приключения"),
                description = "Повелитель сил тьмы Саурон направляет свою бесчисленную армию под стены Минас-Тирита. Два хоббита приближаются к Роковой Горе, чтобы уничтожить Кольцо Всевластья.",
                year = 2003,
                countries = listOf("США", "Новая Зеландия"),
                actors = listOf("Элайджа Вуд", "Вигго Мортенсен", "Иэн Маккеллен"),
                director = "Питер Джексон",
                duration = 201,
                rating = 8.9
            ),
            Movie(
                id = 6,
                title = "Бойцовский клуб",
                genres = listOf("Драма", "Триллер"),
                description = "Сотрудник страховой компании страдает хронической бессонницей. Однажды он знакомится с харизматичным Тайлером Дёрденом, с которым создаёт подпольный бойцовский клуб.",
                year = 1999,
                countries = listOf("США", "Германия"),
                actors = listOf("Эдвард Нортон", "Брэд Питт", "Хелена Бонем Картер"),
                director = "Дэвид Финчер",
                duration = 139,
                rating = 8.8
            )
        )
    }
}