# Class Reflection: Session 2

## Executive Summary
This session focused on three foundational pillars of modern software systems: modern computer graphics rendering, digital image processing pipelines, and secure cryptographic protocols for software development.

---
##  Mathematics in Computer Graphics
Mathematical concepts form the structural backbone of visual rendering engines, directly controlling object positioning, orientation, and scaling in coordinate space.

* **Vectors & Matrices:** Used to perform affine transformations (translation, rotation, scaling) across coordinate systems.
* **Parametric Curves & Surfaces:** Essential for modeling continuous, smooth geometry (e.g., Bézier curves, splines).
* **Coordinate Pipelines:** Mapping local model coordinates to world space, camera view space, and ultimately 2D screen projections.

## Computer graphics vs Image processing

| Dimension | Computer Graphics | Image Processing |
| :--- | :--- | :--- |
| **Input** | Abstract mathematical models, vectors, parameters | Existing 2D image data / pixel arrays |
| **Primary Process** | Synthesis, lighting, shading, rasterization | Filtering, noise reduction, feature extraction |
| **Output** | Synthesized 2D rendered image | Modified image or extracted data points |

##  Cryptographic Security & Git Workflows
Secure remote repository operations rely on public-key cryptography to ensure data integrity and user identity verification.

* **Authentication Models:** 
  * **HTTPS:** Relies on access tokens/passwords over TLS for request-level authentication.
  * **SSH (Secure Shell):** Uses asymmetric key pairs for continuous, stateless server-client authentication.
* **Asymmetric Cryptography:**
  * **Public Key:** Shared openly with GitHub to encrypt data and verify signatures.
  * **Private Key:** Stored securely on the local machine to decrypt data and sign authentication challenges.

## Conclusion & Key Takeaways
Understanding these core principles connects theoretical linear algebra with practical real-time rendering, while reinforcing the operational security required when managing codebases via modern version control platforms.
