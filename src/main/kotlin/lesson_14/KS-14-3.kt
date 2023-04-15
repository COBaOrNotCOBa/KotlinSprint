package lesson_14

fun main() {

    val post = ForumAuthorText(
        "Ola!",
        "Amigos",
    )

    val comment = ForumComment(
        "Ola!",
        "Amigo",
        "Прэвед!",
        "Медвэд",
    )

    post.forumPost()
    comment.forumPost()
}

open class ForumAuthorText(
    val text: String,
    val authorOfPost: String,
) {
    open fun forumPost() = println("$authorOfPost: $text")
}

class ForumComment(
    text: String,
    authorOfPost: String,
    val comment: String,
    val authorOfComment: String,
) : ForumAuthorText(text, authorOfPost) {
    override fun forumPost() {
        println("Коментарий к записи: \"$authorOfPost: $text\"")
        println("$authorOfComment: $comment")
    }
}