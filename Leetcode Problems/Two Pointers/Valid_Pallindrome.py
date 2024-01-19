class Solution:
    def isPalindrome(self, s: str) -> bool:
        a1 = ""
        a2 = ""
        for char in s:
            if (
                (char >= "a" and char <= "z")
                or (char >= "A" and char <= "Z")
                or (char >= "0" and char <= "9")
            ):
                a1 += char
        for char in s[::-1]:
            if (
                (char >= "a" and char <= "z")
                or (char >= "A" and char <= "Z")
                or (char >= "0" and char <= "9")
            ):
                a2 += char
        if a1.lower() == a2.lower():
            return True
        else:
            return False
