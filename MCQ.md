# 📘 SmartCampus MCQ Answers

## MCQ 1: Collections Design

**Q:** A developer is implementing student enrollments where each student can enroll in multiple courses.
**Answer:** ✅ B. HashMap<Student, ArrayList<Course>>

**Explanation:**
HashMap fast lookup provide karta hai (O(1)) aur ArrayList multiple courses store karne me help karta hai.

---

## MCQ 2: Exception Handling

**Q:** Negative course fee handle karna hai.
**Answer:** ✅ C. Throw a custom exception like InvalidFeeException

**Explanation:**
Custom exception se proper validation aur error handling possible hota hai.

---

## MCQ 3: Multithreading Issue

**Q:** Multiple threads same data access kar rahe hain.
**Answer:** ✅ B. Use synchronized block or thread-safe collection

**Explanation:**
Synchronization race condition ko prevent karta hai.

---

## MCQ 4: OOP Design

**Q:** Har course ko calculateFee() implement karna hai.
**Answer:** ✅ B. Interface

**Explanation:**
Interface enforce karta hai ki har class method implement kare.
