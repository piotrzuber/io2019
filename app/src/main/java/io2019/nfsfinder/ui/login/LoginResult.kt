package io2019.nfsfinder.ui.login

/**
 * Authentication loginResult : success (user details) or error message.
 */
data class LoginResult(
    val success: LoggedInUserView? = null,
    val error: Int? = null
)
