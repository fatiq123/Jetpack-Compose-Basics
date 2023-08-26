package com.example.basiclayoutsjetpackcompose

data class Category(val img: Int, val title: String, val subtitle: String)


fun getCategoryList(): MutableList<Category> {

    val list = mutableListOf<Category>()

    list.add(Category(R.drawable.background, "Programming", "Learn Different Languages."))
    list.add(Category(R.drawable.background, "Technology", "News about new Tech."))
    list.add(Category(R.drawable.background, "Full Stack Development", "From Backend to Frontend."))
    list.add(Category(R.drawable.background, "DevOps", "Deployment, CI, CD etc."))
    list.add(Category(R.drawable.background, "AI & ML", "Basic Artificial Intelligence."))

    list.add(Category(R.drawable.background, "Programming", "Learn Different Languages."))
    list.add(Category(R.drawable.background, "Technology", "News about new Tech."))
    list.add(Category(R.drawable.background, "Full Stack Development", "From Backend to Frontend."))
    list.add(Category(R.drawable.background, "DevOps", "Deployment, CI, CD etc."))
    list.add(Category(R.drawable.background, "AI & ML", "Basic Artificial Intelligence."))

    list.add(Category(R.drawable.background, "Programming", "Learn Different Languages."))
    list.add(Category(R.drawable.background, "Technology", "News about new Tech."))
    list.add(Category(R.drawable.background, "Full Stack Development", "From Backend to Frontend."))
    list.add(Category(R.drawable.background, "DevOps", "Deployment, CI, CD etc."))
    list.add(Category(R.drawable.background, "AI & ML", "Basic Artificial Intelligence."))

    return list
}