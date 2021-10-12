package data

class Company(val name: String) {

    override fun hashCode(): Int {
        return name.hashCode()
    }

    override fun equals(other: Any?): Boolean {
        return when (other) {
            is Company -> this.name == other.name
            else -> false
        }
    }
}