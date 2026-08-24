# Class Reflection: Session 2

## Executive Summary
This session focused on three foundational pillars of modern software systems: modern computer graphics rendering, digital image processing pipelines, and secure cryptographic protocols for software development.

---

## 1. Mathematics in Computer Graphics
Mathematical concepts form the structural backbone of visual rendering engines, directly controlling object positioning, orientation, and scaling in coordinate space.

* **Vectors & Matrices:** Used to perform affine transformations (translation, rotation, scaling) across coordinate systems.
* **Parametric Curves & Surfaces:** Essential for modeling continuous, smooth geometry (e.g., Bézier curves, splines).
* **Coordinate Pipelines:** Mapping local model coordinates to world space, camera view space, and ultimately 2D screen projections.

```mermaid
graph LR
    A[Model Space] -->|World Matrix| B[World Space]
    B -->|View Matrix| C[Camera/View Space]
    C -->|Projection Matrix| D[Clip/Screen Space]
    D -->|Rasterization| E[Pixels on Display]

flowchart TD
    subgraph Computer Graphics
        Data[Geometric Data & Vectors] --> Render Engine --> Visual1[Rendered Image]
    end
    
    subgraph Image Processing
        Visual2[Raw Image Input] --> Image Filter/Algorithm --> OutputData[Enhanced Image / Features]
    end

sequenceDiagram
    autonumber
    participant Local as Local Machine (Private Key)
    participant GitHub as GitHub Server (Public Key)
    
    Local->>GitHub: Initiate SSH Connection Request
    GitHub->>Local: Send Cryptographic Challenge
    Local->>Local: Sign Challenge with Private Key
    Local->>GitHub: Return Signed Response
    GitHub->>GitHub: Verify Signature using stored Public Key
    GitHub-->>Local: Access Granted (Secure Session Established)

```

## Conclusion & Key Takeaways
Understanding these core principles connects theoretical linear algebra with practical real-time rendering, while reinforcing the operational security required when managing codebases via modern version control platforms.
