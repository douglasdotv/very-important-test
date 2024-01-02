import Foundation

struct Mystery {
    var message: String

    func reveal() -> String {
        String(message.reversed())
    }
}

let secret = Mystery(message: "dlroW ,olleH")

print(secret.reveal())
