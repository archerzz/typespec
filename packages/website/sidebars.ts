import { SidebarsConfig } from "@docusaurus/plugin-content-docs";
import { SidebarItemConfig } from "@docusaurus/plugin-content-docs/src/sidebars/types.js";

function createLibraryReferenceStructure(
  libDir: string,
  labelName: string,
  hasLinterRules: boolean,
  extra: SidebarItemConfig[],
): SidebarItemConfig {
  const rules: SidebarItemConfig = {
    type: "category",
    label: "Rules",
    items: [
      {
        type: "autogenerated",
        dirName: `${libDir}/rules`,
      },
    ],
  };
  return {
    type: "category",
    label: labelName,
    link: {
      type: "doc",
      id: `${libDir}/reference/index`,
    },
    items: [
      {
        type: "autogenerated",
        dirName: `${libDir}/reference`,
      },
      ...(hasLinterRules ? [rules] : []),
      ...(extra ?? []),
    ],
  };
}

const sidebars: SidebarsConfig = {
  docsSidebar: [
    {
      type: "category",
      label: "Getting started",
      items: [
        "introduction/installation",
        {
          type: "category",
          label: "Editor",
          items: ["introduction/editor/vscode", "introduction/editor/vs"],
        },
      ],
    },
    {
      type: "category",
      label: "Guides",
      items: [
        {
          type: "category",
          label: "TypeSpec for REST",
          link: { type: "doc", id: "getting-started/getting-started-rest/01-setup-basic-syntax" },
          items: [
            {
              type: "autogenerated",
              dirName: `getting-started/getting-started-rest`,
            },
          ],
        },
        "getting-started/typespec-for-openapi-dev",
      ],
    },
    {
      type: "category",
      label: "Handbook",
      items: [
        "handbook/cli",
        "handbook/style-guide",
        "handbook/formatter",
        "handbook/reproducibility",
        {
          type: "category",
          label: "Configuration",
          items: ["handbook/configuration/configuration", "handbook/configuration/tracing"],
        },
        "handbook/releases",
        "handbook/faq",
      ],
    },
    {
      type: "category",
      label: "📐 Language Basics",
      items: [
        "language-basics/overview",
        "language-basics/built-in-types",
        "language-basics/identifiers",
        "language-basics/imports",
        "language-basics/namespaces",
        "language-basics/decorators",
        "language-basics/documentation",
        "language-basics/scalars",
        "language-basics/models",
        "language-basics/operations",
        "language-basics/interfaces",
        "language-basics/templates",
        "language-basics/enums",
        "language-basics/unions",
        "language-basics/intersections",
        "language-basics/type-literals",
        "language-basics/aliases",
        "language-basics/values",
        "language-basics/type-relations",
      ],
    },
    {
      type: "category",
      label: "📘 Standard Library",
      items: [
        "standard-library/built-in-decorators",
        "standard-library/built-in-data-types",
        {
          type: "autogenerated",
          dirName: `standard-library/reference`,
        },
        "standard-library/discriminated-types",
        "standard-library/examples",
        "standard-library/pagination",
      ],
    },
    {
      type: "category",
      label: "📚 Libraries",
      items: [
        createLibraryReferenceStructure("libraries/http", "Http", true, [
          "libraries/http/cheat-sheet",
          "libraries/http/authentication",
          "libraries/http/operations",
          "libraries/http/content-types",
          "libraries/http/multipart",
          "libraries/http/encoding",
          "libraries/http/examples",
        ]),
        createLibraryReferenceStructure("libraries/rest", "Rest", false, [
          "libraries/rest/cheat-sheet",
          "libraries/rest/resource-routing",
        ]),
        createLibraryReferenceStructure("libraries/openapi", "OpenAPI", false, []),
        createLibraryReferenceStructure("libraries/versioning", "Versioning", false, [
          "libraries/versioning/guide",
        ]),
        createLibraryReferenceStructure("libraries/xml", "Xml", false, ["libraries/xml/guide"]),
      ],
    },
    {
      type: "category",
      label: "🖨️ Emitters",
      items: [
        createLibraryReferenceStructure("emitters/json-schema", "JSON Schema", false, []),
        createLibraryReferenceStructure("emitters/openapi3", "OpenAPI3", false, [
          "emitters/openapi3/openapi",
          "emitters/openapi3/cli",
          "emitters/openapi3/diagnostics",
        ]),
        createLibraryReferenceStructure("emitters/protobuf", "Protobuf", false, [
          "emitters/protobuf/guide",
        ]),
      ],
    },
    {
      type: "category",
      label: "🛠️ Writing TypeSpec Libraries",
      items: [
        "extending-typespec/basics",
        "extending-typespec/diagnostics",
        "extending-typespec/create-decorators",
        "extending-typespec/linters",
        "extending-typespec/codefixes",
        "extending-typespec/emitters",
        "extending-typespec/emitter-framework",
        "extending-typespec/emitter-metadata-handling",
        "extending-typespec/writing-scaffolding-template",
      ],
    },
    {
      type: "category",
      label: "🚀 Release Notes",
      collapsed: true,
      link: {
        type: "generated-index",
        title: "Release Notes",
        slug: "/release-notes",
      },
      items: [
        {
          type: "autogenerated",
          dirName: "release-notes",
        },
      ],
    },
  ],
};

export default sidebars;
