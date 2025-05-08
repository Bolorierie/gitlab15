# 🛠️ Merge Conflict Resolution Documentation

This document describes how a merge conflict was created and resolved in the repository.

---

## ⚔️ How the Conflict Was Created

A conflict was intentionally created by editing the same line of the same file (`Multiplication.java`) in both the `develop` and `feature/add-multiplication` branches.

### In `develop`:
```java
/**
 * Multiply two double numbers and return the result.
 */
```

### In `feature/add-multiplication`:
```java
/**
 * Calculates the product of two numbers.
 */
```

---

## ✅ Steps to Resolve the Conflict (Locally)

1. Checkout the `develop` branch and ensure it's up to date:
```bash
git checkout develop
git pull origin develop
```

2. Merge the conflicting feature branch:
```bash
git merge feature/add-multiplication
```

3. Git reports a conflict in `Multiplication.java`. Open the file and manually edit the conflict markers:
```java
<<<<<<< HEAD
/**
 * Multiply two double numbers and return the result.
=======
/**
 * Calculates the product of two numbers.
>>>>>>> feature/add-multiplication
 */
```

4. Resolve the conflict by keeping or combining the desired comment:
```java
/**
 * Multiplies two double numbers and returns the product.
 */
```

5. Mark the conflict as resolved:
```bash
git add src/main/java/labxx/sict/must/edu/mn/Multiplication.java
```

6. Commit the merge:
```bash
git commit -m "Resolve merge conflict in Multiplication.java"
```

7. Push the changes:
```bash
git push origin develop
```

---

## 📋 Git Commands Used

```bash
git checkout develop
git pull origin develop
git merge feature/add-multiplication
# (manual edit)
git add <conflicted-file>
git commit -m "Resolve merge conflict"
git push origin develop
```

---

## 📌 Notes

- Ensure CI checks pass before merging to `main`.
- 100% test coverage and successful `checkstyle` validation are required by branch protection rules.

