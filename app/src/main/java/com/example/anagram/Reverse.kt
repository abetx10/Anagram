package com.example.anagram

class Reverse {
    fun reverseAnagram(str: String, filter: String): String {
        val chars: CharArray = str.toCharArray()
        val filterChars = filter.toCharArray()

        var left = 0
        var right = str.length - 1
        while (left < right)
        {
            if (!Character.isLetter(chars[left]) || filterChars.contains(chars[left]))
                left++
            else if (!Character.isLetter(chars[right]) || filterChars.contains(chars[right]))
                right--
            else {

                val temp = chars[left]
                chars[left] = chars[right]
                chars[right] = temp
                left++; right--
            }
        }

        return String(chars)
    }
}