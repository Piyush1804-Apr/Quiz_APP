package com.practice.qwiz_app

object Constants {

    const val  USER_NAME : String = "user_name"
    const val  TOTAL_QUESTIONS :String = "total_questions"
    const val CORRECT_ANSWERS : String = "correct_answers"




    fun getQuestions():ArrayList<Question>{
        val questionList = ArrayList<Question>()
        val que1 = Question(

            1,"Find out which of the figures (1), (2), (3) and (4) can be formed from the pieces given in figure (X).",
              R.drawable.que1,
              "1",
              "2",
            "3",
            "4",
            3
        )
        questionList.add(que1)


        val que2 = Question(

            2,"Find out which of the figures (1), (2), (3) and (4) can be formed from the pieces given in figure (X).",
            R.drawable.que2,
            "1",
            "2",
            "3",
            "4",
            2
        )
        questionList.add(que2)

        val que3 = Question(

            3,"Find out which of the figures (1), (2), (3) and (4) can be formed from the pieces given in figure (X).",
            R.drawable.que3,
            "1",
            "2",
            "3",
            "4",
            2
        )
        questionList.add(que3)

        val que4 = Question(

            4,"Find out which of the figures (1), (2), (3) and (4) can be formed from the pieces given in figure (X).",
            R.drawable.que4,
            "1",
            "2",
            "3",
            "4",
            2
        )
        questionList.add(que4)

        val que5= Question(

            5,"Find out which of the figures (1), (2), (3) and (4) can be formed from the pieces given in figure (X).",
            R.drawable.que5,
            "1",
            "2",
            "3",
            "4",
            1
        )
        questionList.add(que5)
        val que6= Question(

            6,"Find out which of the figures (1), (2), (3) and (4) can be formed from the pieces given in figure (X).",
            R.drawable.que6,
            "1",
            "2",
            "3",
            "4",
            1
        )
        questionList.add(que6)

        val que7= Question(

            7,"Find out which of the figures (1), (2), (3) and (4) can be formed from the pieces given in figure (X).",
            R.drawable.que7,
            "1",
            "2",
            "3",
            "4",
            3
        )
        questionList.add(que7)

        val que8= Question(

            8,"Find out which of the figures (1), (2), (3) and (4) can be formed from the pieces given in figure (X).",
            R.drawable.que8,
            "1",
            "4",
            "3",
            "2",
            4
        )
        questionList.add(que8)




        return questionList
    }
}