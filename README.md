# Lutece AI Platform Library

Shared library for the LuteceAI platform: API contracts (DTOs) and shared domain objects used by `plugin-platform` and its client plugins.

## Overview

This library carries the **contracts** of the LuteceAI platform API. Client plugins depend on it to exchange typed payloads with the platform REST API instead of duplicating DTO definitions.

It contains two kinds of classes:

- **API DTOs** (`*DTO` suffix, Jackson-annotated) — request/response shapes of the platform REST API, organized by domain.
- **Shared domain objects** — a minimal shared kernel (`Subscription`, `SubscriptionStatus`) used by plugins that need to read platform subscriptions. Persistence stays in `plugin-platform`.