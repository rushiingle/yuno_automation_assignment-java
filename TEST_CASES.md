# \# Yuno API Test Cases

# 

# \## Purchase

# \- Minimal fields – Sanity

# \- Invalid card number – Regression / Negative

# \- Missing workflow – Integration / Negative

# 

# \## Refund

# \- Refund successful payment – Regression

# \- Refund invalid payment id – Negative

# 

# \## Authorization

# \- Authorization minimal – Sanity

# \- Authorization invalid amount – Negative

# 

# \## Capture

# \- Capture authorized payment – Sanity

# \- Capture invalid authorization – Negative

# 

# \## Cancel

# \- Cancel authorized payment – Regression

# 

# \## Verify

# \- Verify card without charging – Sanity

# \- Verify expired card – Negative

# 

# \## Functional Requirements

# \- workflow must be DIRECT

# \- Refund allowed only for successful payments

# \- Capture only after authorization

# 

# \## Non-Functional Requirements

# \- Idempotency key prevents duplicates

# \- Response time < 2 seconds

# \- Secure handling of API credentials



