Бд SQLite:
Юзеры (айди, логин, почта, пароль, баланс)
Сессии(uid, ключ)

Эндпоинты:
/ GET - гланвый экран
/login POST(login: str, password: str) -> { sessionKey, email, balance}
/register POST(login: str, email: str, password: str) -> { sessionKey }
/deposit POST(sessionKey: str, amount: int) – закинуть деньгов -> { balance }
/play POST(sessionKey: str) – слоты -> { result[enum(3)], balance }

