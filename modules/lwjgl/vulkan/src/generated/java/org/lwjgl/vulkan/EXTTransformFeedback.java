/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * This extension adds transform feedback to the Vulkan API by exposing the SPIR-V {@code TransformFeedback} and {@code GeometryStreams} capabilities to capture vertex, tessellation or geometry shader outputs to one or more buffers. It adds API functionality to bind transform feedback buffers to capture the primitives emitted by the graphics pipeline from SPIR-V outputs decorated for transform feedback. The transform feedback capture can be paused and resumed by way of storing and retrieving a byte counter. The captured data can be drawn again where the vertex count is derived from the byte counter without CPU intervention. If the implementation is capable, a vertex stream other than zero can be rasterized.
 * 
 * <p>All these features are designed to match the full capabilities of OpenGL core transform feedback functionality and beyond. Many of the features are optional to allow base OpenGL ES GPUs to also implement this extension.</p>
 * 
 * <p>The primary purpose of the functionality exposed by this extension is to support translation layers from other 3D APIs. This functionality is not considered forward looking, and is not expected to be promoted to a KHR extension or to core Vulkan. Unless this is needed for translation, it is recommended that developers use alternative techniques of using the GPU to process and capture vertex data.</p>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_EXT_transform_feedback}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>29</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * <li>Requires {@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Piers Daniell <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?title=VK_EXT_transform_feedback:%20&amp;body=@pdaniell-nv%20">pdaniell-nv</a></li>
 * </ul></dd>
 * <dt><b>Last Modified Data</b></dt>
 * <dd>2018-10-09</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Baldur Karlsson, Valve</li>
 * <li>Boris Zanin, Mobica</li>
 * <li>Daniel Rakos, AMD</li>
 * <li>Donald Scorgie, Imagination</li>
 * <li>Henri Verbeet, CodeWeavers</li>
 * <li>Jan-Harald Fredriksen, Arm</li>
 * <li>Jason Ekstrand, Intel</li>
 * <li>Jeff Bolz, NVIDIA</li>
 * <li>Jesse Barker, Unity</li>
 * <li>Jesse Hall, Google</li>
 * <li>Pierre-Loup Griffais, Valve</li>
 * <li>Philip Rebohle, DXVK</li>
 * <li>Ruihao Zhang, Qualcomm</li>
 * <li>Samuel Pitoiset, Valve</li>
 * <li>Slawomir Grajewski, Intel</li>
 * <li>Stu Smith, Imagination Technologies</li>
 * </ul></dd>
 * </dl>
 */
public class EXTTransformFeedback {

    /** The extension specification version. */
    public static final int VK_EXT_TRANSFORM_FEEDBACK_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_EXT_TRANSFORM_FEEDBACK_EXTENSION_NAME = "VK_EXT_transform_feedback";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TRANSFORM_FEEDBACK_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_TRANSFORM_FEEDBACK_FEATURES_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TRANSFORM_FEEDBACK_PROPERTIES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_TRANSFORM_FEEDBACK_PROPERTIES_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_STATE_STREAM_CREATE_INFO_EXT STRUCTURE_TYPE_PIPELINE_RASTERIZATION_STATE_STREAM_CREATE_INFO_EXT}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TRANSFORM_FEEDBACK_FEATURES_EXT     = 1000028000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TRANSFORM_FEEDBACK_PROPERTIES_EXT   = 1000028001,
        VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_STATE_STREAM_CREATE_INFO_EXT = 1000028002;

    /** Extends {@code VkQueryType}. */
    public static final int VK_QUERY_TYPE_TRANSFORM_FEEDBACK_STREAM_EXT = 1000028004;

    /**
     * Extends {@code VkBufferUsageFlagBits}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_BUFFER_USAGE_TRANSFORM_FEEDBACK_BUFFER_BIT_EXT BUFFER_USAGE_TRANSFORM_FEEDBACK_BUFFER_BIT_EXT}</li>
     * <li>{@link #VK_BUFFER_USAGE_TRANSFORM_FEEDBACK_COUNTER_BUFFER_BIT_EXT BUFFER_USAGE_TRANSFORM_FEEDBACK_COUNTER_BUFFER_BIT_EXT}</li>
     * </ul>
     */
    public static final int
        VK_BUFFER_USAGE_TRANSFORM_FEEDBACK_BUFFER_BIT_EXT         = 0x800,
        VK_BUFFER_USAGE_TRANSFORM_FEEDBACK_COUNTER_BUFFER_BIT_EXT = 0x1000;

    /**
     * Extends {@code VkAccessFlagBits}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_ACCESS_TRANSFORM_FEEDBACK_WRITE_BIT_EXT ACCESS_TRANSFORM_FEEDBACK_WRITE_BIT_EXT}</li>
     * <li>{@link #VK_ACCESS_TRANSFORM_FEEDBACK_COUNTER_READ_BIT_EXT ACCESS_TRANSFORM_FEEDBACK_COUNTER_READ_BIT_EXT}</li>
     * <li>{@link #VK_ACCESS_TRANSFORM_FEEDBACK_COUNTER_WRITE_BIT_EXT ACCESS_TRANSFORM_FEEDBACK_COUNTER_WRITE_BIT_EXT}</li>
     * </ul>
     */
    public static final int
        VK_ACCESS_TRANSFORM_FEEDBACK_WRITE_BIT_EXT         = 0x2000000,
        VK_ACCESS_TRANSFORM_FEEDBACK_COUNTER_READ_BIT_EXT  = 0x4000000,
        VK_ACCESS_TRANSFORM_FEEDBACK_COUNTER_WRITE_BIT_EXT = 0x8000000;

    /** Extends {@code VkPipelineStageFlagBits}. */
    public static final int VK_PIPELINE_STAGE_TRANSFORM_FEEDBACK_BIT_EXT = 0x1000000;

    protected EXTTransformFeedback() {
        throw new UnsupportedOperationException();
    }

    static boolean checkCapsDevice(FunctionProvider provider, java.util.Map<String, Long> caps, java.util.Set<String> ext) {
        return ext.contains("VK_EXT_transform_feedback") && VK.checkExtension("VK_EXT_transform_feedback",
               VK.isSupported(provider, "vkCmdBindTransformFeedbackBuffersEXT", caps)
            && VK.isSupported(provider, "vkCmdBeginTransformFeedbackEXT", caps)
            && VK.isSupported(provider, "vkCmdEndTransformFeedbackEXT", caps)
            && VK.isSupported(provider, "vkCmdBeginQueryIndexedEXT", caps)
            && VK.isSupported(provider, "vkCmdEndQueryIndexedEXT", caps)
            && VK.isSupported(provider, "vkCmdDrawIndirectByteCountEXT", caps)
        );
    }

    // --- [ vkCmdBindTransformFeedbackBuffersEXT ] ---

    /**
     * Unsafe version of: {@link #vkCmdBindTransformFeedbackBuffersEXT CmdBindTransformFeedbackBuffersEXT}
     *
     * @param bindingCount the number of transform feedback bindings whose state is updated by the command.
     */
    public static void nvkCmdBindTransformFeedbackBuffersEXT(VkCommandBuffer commandBuffer, int firstBinding, int bindingCount, long pBuffers, long pOffsets, long pSizes) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBindTransformFeedbackBuffersEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPPV(__functionAddress, commandBuffer.address(), firstBinding, bindingCount, pBuffers, pOffsets, pSizes);
    }

    /**
     * Bind transform feedback buffers to a command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To bind transform feedback buffers to a command buffer for use in subsequent draw commands, call:</p>
     * 
     * <pre><code>
     * void vkCmdBindTransformFeedbackBuffersEXT(
     *     VkCommandBuffer                             commandBuffer,
     *     uint32_t                                    firstBinding,
     *     uint32_t                                    bindingCount,
     *     const VkBuffer*                             pBuffers,
     *     const VkDeviceSize*                         pOffsets,
     *     const VkDeviceSize*                         pSizes);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>The values taken from elements <code>i</code> of {@code pBuffers}, {@code pOffsets} and {@code pSizes} replace the current state for the transform feedback binding <code>firstBinding + i</code>, for <code>i</code> in <code>[0, bindingCount)</code>. The transform feedback binding is updated to start at the offset indicated by {@code pOffsets}[i] from the start of the buffer {@code pBuffers}[i].</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>{@link VkPhysicalDeviceTransformFeedbackFeaturesEXT}{@code ::transformFeedback} <b>must</b> be enabled</li>
     * <li>{@code firstBinding} <b>must</b> be less than {@link VkPhysicalDeviceTransformFeedbackPropertiesEXT}{@code ::maxTransformFeedbackBuffers}</li>
     * <li>The sum of {@code firstBinding} and {@code bindingCount} <b>must</b> be less than or equal to {@link VkPhysicalDeviceTransformFeedbackPropertiesEXT}{@code ::maxTransformFeedbackBuffers}</li>
     * <li>All elements of {@code pOffsets} <b>must</b> be less than the size of the corresponding element in {@code pBuffers}</li>
     * <li>All elements of {@code pOffsets} <b>must</b> be a multiple of 4</li>
     * <li>All elements of {@code pBuffers} <b>must</b> have been created with the {@link #VK_BUFFER_USAGE_TRANSFORM_FEEDBACK_BUFFER_BIT_EXT BUFFER_USAGE_TRANSFORM_FEEDBACK_BUFFER_BIT_EXT} flag</li>
     * <li>If the optional {@code pSize} array is specified, each element of {@code pSizes} <b>must</b> either be {@link VK10#VK_WHOLE_SIZE WHOLE_SIZE}, or be less than or equal to {@link VkPhysicalDeviceTransformFeedbackPropertiesEXT}{@code ::maxTransformFeedbackBufferSize}</li>
     * <li>All elements of {@code pSizes} <b>must</b> be less than or equal to the size of the corresponding buffer in {@code pBuffers}</li>
     * <li>All elements of {@code pOffsets} plus {@code pSizes}, where the {@code pSizes}, element is not {@link VK10#VK_WHOLE_SIZE WHOLE_SIZE}, <b>must</b> be less than or equal to the size of the corresponding element in {@code pBuffers}</li>
     * <li>Each element of {@code pBuffers} that is non-sparse <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
     * <li>Transform feedback <b>must</b> not be active when the {@code vkCmdBindTransformFeedbackBuffersEXT} command is recorded</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code pBuffers} <b>must</b> be a valid pointer to an array of {@code bindingCount} valid {@code VkBuffer} handles</li>
     * <li>{@code pOffsets} <b>must</b> be a valid pointer to an array of {@code bindingCount} {@code VkDeviceSize} values</li>
     * <li>If {@code pSizes} is not {@code NULL}, {@code pSizes} <b>must</b> be a valid pointer to an array of {@code bindingCount} {@code VkDeviceSize} values</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
     * <li>If {@code pSizes} is not {@code NULL}, {@code bindingCount} <b>must</b> be greater than 0</li>
     * <li>Both of {@code commandBuffer}, and the elements of {@code pBuffers} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
     * </ul>
     * 
     * <h5>Host Synchronization</h5>
     * 
     * <ul>
     * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
     * <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
     * </ul>
     * 
     * <h5>Command Properties</h5>
     * 
     * <table class="lwjgl">
     * <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics</td><td></td></tr></tbody>
     * </table>
     *
     * @param commandBuffer the command buffer into which the command is recorded.
     * @param firstBinding  the index of the first transform feedback binding whose state is updated by the command.
     * @param pBuffers      a pointer to an array of buffer handles.
     * @param pOffsets      a pointer to an array of buffer offsets.
     * @param pSizes        an optional array of buffer sizes, which specifies the maximum number of bytes to capture to the corresponding transform feedback buffer. If {@code pSizes} is {@code NULL}, or the value of the {@code pSizes} array element is {@link VK10#VK_WHOLE_SIZE WHOLE_SIZE}, then the maximum bytes captured will be the size of the corresponding buffer minus the buffer offset.
     */
    public static void vkCmdBindTransformFeedbackBuffersEXT(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int firstBinding, @NativeType("VkBuffer const *") LongBuffer pBuffers, @NativeType("VkDeviceSize const *") LongBuffer pOffsets, @Nullable @NativeType("VkDeviceSize const *") LongBuffer pSizes) {
        if (CHECKS) {
            check(pOffsets, pBuffers.remaining());
            checkSafe(pSizes, pBuffers.remaining());
        }
        nvkCmdBindTransformFeedbackBuffersEXT(commandBuffer, firstBinding, pBuffers.remaining(), memAddress(pBuffers), memAddress(pOffsets), memAddressSafe(pSizes));
    }

    // --- [ vkCmdBeginTransformFeedbackEXT ] ---

    /**
     * Unsafe version of: {@link #vkCmdBeginTransformFeedbackEXT CmdBeginTransformFeedbackEXT}
     *
     * @param counterBufferCount the size of the {@code pCounterBuffers} and {@code pCounterBufferOffsets} arrays.
     */
    public static void nvkCmdBeginTransformFeedbackEXT(VkCommandBuffer commandBuffer, int firstCounterBuffer, int counterBufferCount, long pCounterBuffers, long pCounterBufferOffsets) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBeginTransformFeedbackEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(__functionAddress, commandBuffer.address(), firstCounterBuffer, counterBufferCount, pCounterBuffers, pCounterBufferOffsets);
    }

    /**
     * Make transform feedback active in the command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>Transform feedback for specific transform feedback buffers is made active by calling:</p>
     * 
     * <pre><code>
     * void vkCmdBeginTransformFeedbackEXT(
     *     VkCommandBuffer                             commandBuffer,
     *     uint32_t                                    firstCounterBuffer,
     *     uint32_t                                    counterBufferCount,
     *     const VkBuffer*                             pCounterBuffers,
     *     const VkDeviceSize*                         pCounterBufferOffsets);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>The active transform feedback buffers will capture primitives emitted from the corresponding {@code XfbBuffer} in the bound graphics pipeline. Any {@code XfbBuffer} emitted that does not output to an active transform feedback buffer will not be captured.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>{@link VkPhysicalDeviceTransformFeedbackFeaturesEXT}{@code ::transformFeedback} <b>must</b> be enabled</li>
     * <li>Transform feedback <b>must</b> not be active</li>
     * <li>{@code firstCounterBuffer} <b>must</b> be less than {@link VkPhysicalDeviceTransformFeedbackPropertiesEXT}{@code ::maxTransformFeedbackBuffers}</li>
     * <li>The sum of {@code firstCounterBuffer} and {@code counterBufferCount} <b>must</b> be less than or equal to {@link VkPhysicalDeviceTransformFeedbackPropertiesEXT}{@code ::maxTransformFeedbackBuffers}</li>
     * <li>For each buffer handle in the array, if it is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE} it <b>must</b> reference a buffer large enough to hold 4 bytes at the corresponding offset from the {@code pCounterBufferOffsets} array</li>
     * <li>If {@code pCounterBuffer} is {@code NULL}, then {@code pCounterBufferOffsets} <b>must</b> also be {@code NULL}</li>
     * <li>For each buffer handle in the {@code pCounterBuffers} array that is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE} it <b>must</b> have been created with a {@code usage} value containing {@link #VK_BUFFER_USAGE_TRANSFORM_FEEDBACK_COUNTER_BUFFER_BIT_EXT BUFFER_USAGE_TRANSFORM_FEEDBACK_COUNTER_BUFFER_BIT_EXT}</li>
     * <li>Transform feedback <b>must</b> not be made active in a render pass instance with multiview enabled</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>If {@code counterBufferCount} is not 0, and {@code pCounterBuffers} is not {@code NULL}, {@code pCounterBuffers} <b>must</b> be a valid pointer to an array of {@code counterBufferCount} valid {@code VkBuffer} handles</li>
     * <li>If {@code counterBufferCount} is not 0, and {@code pCounterBufferOffsets} is not {@code NULL}, {@code pCounterBufferOffsets} <b>must</b> be a valid pointer to an array of {@code counterBufferCount} {@code VkDeviceSize} values</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
     * <li>This command <b>must</b> only be called inside of a render pass instance</li>
     * <li>Both of {@code commandBuffer}, and the elements of {@code pCounterBuffers} that are valid handles <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
     * </ul>
     * 
     * <h5>Host Synchronization</h5>
     * 
     * <ul>
     * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
     * <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
     * </ul>
     * 
     * <h5>Command Properties</h5>
     * 
     * <table class="lwjgl">
     * <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Inside</td><td>Graphics</td><td></td></tr></tbody>
     * </table>
     *
     * @param commandBuffer         the command buffer into which the command is recorded.
     * @param firstCounterBuffer    the index of the first transform feedback buffer corresponding to {@code pCounterBuffers}[0] and {@code pCounterBufferOffsets}[0].
     * @param pCounterBuffers       an optional array of buffer handles to the counter buffers which contain a 4 byte integer value representing the byte offset from the start of the corresponding transform feedback buffer from where to start capturing vertex data. If the byte offset stored to the counter buffer location was done using {@link #vkCmdEndTransformFeedbackEXT CmdEndTransformFeedbackEXT} it can be used to resume transform feedback from the previous location. If {@code pCounterBuffers} is {@code NULL}, then transform feedback will start capturing vertex data to byte offset zero in all bound transform feedback buffers. For each element of {@code pCounterBuffers} that is {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, transform feedback will start capturing vertex data to byte zero in the corresponding bound transform feedback buffer.
     * @param pCounterBufferOffsets an optional array of offsets within each of the {@code pCounterBuffers} where the counter values were previously written. The location in each counter buffer at these offsets <b>must</b> be large enough to contain 4 bytes of data. This data is the number of bytes captured by the previous transform feedback to this buffer. If {@code pCounterBufferOffsets} is {@code NULL}, then it is assumed the offsets are zero.
     */
    public static void vkCmdBeginTransformFeedbackEXT(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int firstCounterBuffer, @Nullable @NativeType("VkBuffer const *") LongBuffer pCounterBuffers, @Nullable @NativeType("VkDeviceSize const *") LongBuffer pCounterBufferOffsets) {
        if (CHECKS) {
            checkSafe(pCounterBufferOffsets, remainingSafe(pCounterBuffers));
        }
        nvkCmdBeginTransformFeedbackEXT(commandBuffer, firstCounterBuffer, remainingSafe(pCounterBuffers), memAddressSafe(pCounterBuffers), memAddressSafe(pCounterBufferOffsets));
    }

    // --- [ vkCmdEndTransformFeedbackEXT ] ---

    /**
     * Unsafe version of: {@link #vkCmdEndTransformFeedbackEXT CmdEndTransformFeedbackEXT}
     *
     * @param counterBufferCount the size of the {@code pCounterBuffers} and {@code pCounterBufferOffsets} arrays.
     */
    public static void nvkCmdEndTransformFeedbackEXT(VkCommandBuffer commandBuffer, int firstCounterBuffer, int counterBufferCount, long pCounterBuffers, long pCounterBufferOffsets) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdEndTransformFeedbackEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(__functionAddress, commandBuffer.address(), firstCounterBuffer, counterBufferCount, pCounterBuffers, pCounterBufferOffsets);
    }

    /**
     * Make transform feedback inactive in the command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>Transform feedback for specific transform feedback buffers is made inactive by calling:</p>
     * 
     * <pre><code>
     * void vkCmdEndTransformFeedbackEXT(
     *     VkCommandBuffer                             commandBuffer,
     *     uint32_t                                    firstCounterBuffer,
     *     uint32_t                                    counterBufferCount,
     *     const VkBuffer*                             pCounterBuffers,
     *     const VkDeviceSize*                         pCounterBufferOffsets);</code></pre>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>{@link VkPhysicalDeviceTransformFeedbackFeaturesEXT}{@code ::transformFeedback} <b>must</b> be enabled</li>
     * <li>Transform feedback <b>must</b> be active</li>
     * <li>{@code firstCounterBuffer} <b>must</b> be less than {@link VkPhysicalDeviceTransformFeedbackPropertiesEXT}{@code ::maxTransformFeedbackBuffers}</li>
     * <li>The sum of {@code firstCounterBuffer} and {@code counterBufferCount} <b>must</b> be less than or equal to {@link VkPhysicalDeviceTransformFeedbackPropertiesEXT}{@code ::maxTransformFeedbackBuffers}</li>
     * <li>For each buffer handle in the array, if it is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE} it <b>must</b> reference a buffer large enough to hold 4 bytes at the corresponding offset from the {@code pCounterBufferOffsets} array</li>
     * <li>If {@code pCounterBuffer} is {@code NULL}, then {@code pCounterBufferOffsets} <b>must</b> also be {@code NULL}</li>
     * <li>For each buffer handle in the {@code pCounterBuffers} array that is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE} it <b>must</b> have been created with a {@code usage} value containing {@link #VK_BUFFER_USAGE_TRANSFORM_FEEDBACK_COUNTER_BUFFER_BIT_EXT BUFFER_USAGE_TRANSFORM_FEEDBACK_COUNTER_BUFFER_BIT_EXT}</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>If {@code counterBufferCount} is not 0, and {@code pCounterBuffers} is not {@code NULL}, {@code pCounterBuffers} <b>must</b> be a valid pointer to an array of {@code counterBufferCount} valid {@code VkBuffer} handles</li>
     * <li>If {@code counterBufferCount} is not 0, and {@code pCounterBufferOffsets} is not {@code NULL}, {@code pCounterBufferOffsets} <b>must</b> be a valid pointer to an array of {@code counterBufferCount} {@code VkDeviceSize} values</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
     * <li>This command <b>must</b> only be called inside of a render pass instance</li>
     * <li>Both of {@code commandBuffer}, and the elements of {@code pCounterBuffers} that are valid handles <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
     * </ul>
     * 
     * <h5>Host Synchronization</h5>
     * 
     * <ul>
     * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
     * <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
     * </ul>
     * 
     * <h5>Command Properties</h5>
     * 
     * <table class="lwjgl">
     * <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Inside</td><td>Graphics</td><td></td></tr></tbody>
     * </table>
     *
     * @param commandBuffer         the command buffer into which the command is recorded.
     * @param firstCounterBuffer    the index of the first transform feedback buffer corresponding to {@code pCounterBuffers}[0] and {@code pCounterBufferOffsets}[0].
     * @param pCounterBuffers       an optional array of buffer handles to the counter buffers used to record the current byte positions of each transform feedback buffer where the next vertex output data would be captured. This <b>can</b> be used by a subsequent {@link #vkCmdBeginTransformFeedbackEXT CmdBeginTransformFeedbackEXT} call to resume transform feedback capture from this position. It can also be used by {@link #vkCmdDrawIndirectByteCountEXT CmdDrawIndirectByteCountEXT} to determine the vertex count of the draw call.
     * @param pCounterBufferOffsets an optional array of offsets within each of the {@code pCounterBuffers} where the counter values can be written. The location in each counter buffer at these offsets <b>must</b> be large enough to contain 4 bytes of data. The data stored at this location is the byte offset from the start of the transform feedback buffer binding where the next vertex data would be written. If {@code pCounterBufferOffsets} is {@code NULL}, then it is assumed the offsets are zero.
     */
    public static void vkCmdEndTransformFeedbackEXT(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int firstCounterBuffer, @Nullable @NativeType("VkBuffer const *") LongBuffer pCounterBuffers, @Nullable @NativeType("VkDeviceSize const *") LongBuffer pCounterBufferOffsets) {
        if (CHECKS) {
            checkSafe(pCounterBufferOffsets, remainingSafe(pCounterBuffers));
        }
        nvkCmdEndTransformFeedbackEXT(commandBuffer, firstCounterBuffer, remainingSafe(pCounterBuffers), memAddressSafe(pCounterBuffers), memAddressSafe(pCounterBufferOffsets));
    }

    // --- [ vkCmdBeginQueryIndexedEXT ] ---

    /**
     * Begin an indexed query.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To begin an indexed query, call:</p>
     * 
     * <pre><code>
     * void vkCmdBeginQueryIndexedEXT(
     *     VkCommandBuffer                             commandBuffer,
     *     VkQueryPool                                 queryPool,
     *     uint32_t                                    query,
     *     VkQueryControlFlags                         flags,
     *     uint32_t                                    index);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>The {@code vkCmdBeginQueryIndexedEXT} command operates the same as the {@link VK10#vkCmdBeginQuery CmdBeginQuery} command, except that it also accepts a query type specific {@code index} parameter.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>{@code queryPool} <b>must</b> have been created with a {@code queryType} that differs from that of any queries that are <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#queries-operation-active">active</a> within {@code commandBuffer}</li>
     * <li>All queries used by the command <b>must</b> be unavailable</li>
     * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#features-features-occlusionQueryPrecise">precise occlusion queries</a> feature is not enabled, or the {@code queryType} used to create {@code queryPool} was not {@link VK10#VK_QUERY_TYPE_OCCLUSION QUERY_TYPE_OCCLUSION}, {@code flags} <b>must</b> not contain {@link VK10#VK_QUERY_CONTROL_PRECISE_BIT QUERY_CONTROL_PRECISE_BIT}</li>
     * <li>{@code query} <b>must</b> be less than the number of queries in {@code queryPool}</li>
     * <li>If the {@code queryType} used to create {@code queryPool} was {@link VK10#VK_QUERY_TYPE_OCCLUSION QUERY_TYPE_OCCLUSION}, the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
     * <li>If the {@code queryType} used to create {@code queryPool} was {@link VK10#VK_QUERY_TYPE_PIPELINE_STATISTICS QUERY_TYPE_PIPELINE_STATISTICS} and any of the {@code pipelineStatistics} indicate graphics operations, the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
     * <li>If the {@code queryType} used to create {@code queryPool} was {@link VK10#VK_QUERY_TYPE_PIPELINE_STATISTICS QUERY_TYPE_PIPELINE_STATISTICS} and any of the {@code pipelineStatistics} indicate compute operations, the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support compute operations</li>
     * <li>{@code commandBuffer} <b>must</b> not be a protected command buffer</li>
     * <li>If {@code vkCmdBeginQuery} is called within a render pass instance, the sum of {@code query} and the number of bits set in the current subpass&#8217;s view mask <b>must</b> be less than or equal to the number of queries in {@code queryPool}</li>
     * <li>If the {@code queryType} used to create {@code queryPool} was {@link #VK_QUERY_TYPE_TRANSFORM_FEEDBACK_STREAM_EXT QUERY_TYPE_TRANSFORM_FEEDBACK_STREAM_EXT} the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
     * <li>If the {@code queryType} used to create {@code queryPool} was {@link #VK_QUERY_TYPE_TRANSFORM_FEEDBACK_STREAM_EXT QUERY_TYPE_TRANSFORM_FEEDBACK_STREAM_EXT} the {@code index} parameter <b>must</b> be less than {@link VkPhysicalDeviceTransformFeedbackPropertiesEXT}{@code ::maxTransformFeedbackStreams}</li>
     * <li>If the {@code queryType} used to create {@code queryPool} was not {@link #VK_QUERY_TYPE_TRANSFORM_FEEDBACK_STREAM_EXT QUERY_TYPE_TRANSFORM_FEEDBACK_STREAM_EXT} the {@code index} <b>must</b> be zero</li>
     * <li>If the {@code queryType} used to create {@code queryPool} was {@link #VK_QUERY_TYPE_TRANSFORM_FEEDBACK_STREAM_EXT QUERY_TYPE_TRANSFORM_FEEDBACK_STREAM_EXT} then {@link VkPhysicalDeviceTransformFeedbackPropertiesEXT}{@code ::transformFeedbackQueries} <b>must</b> be supported</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code queryPool} <b>must</b> be a valid {@code VkQueryPool} handle</li>
     * <li>{@code flags} <b>must</b> be a valid combination of {@code VkQueryControlFlagBits} values</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
     * <li>Both of {@code commandBuffer}, and {@code queryPool} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
     * </ul>
     * 
     * <h5>Host Synchronization</h5>
     * 
     * <ul>
     * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
     * <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
     * </ul>
     * 
     * <h5>Command Properties</h5>
     * 
     * <table class="lwjgl">
     * <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics Compute</td><td></td></tr></tbody>
     * </table>
     *
     * @param commandBuffer the command buffer into which this command will be recorded.
     * @param queryPool     the query pool that will manage the results of the query.
     * @param query         the query index within the query pool that will contain the results.
     * @param flags         a bitmask of {@code VkQueryControlFlagBits} specifying constraints on the types of queries that <b>can</b> be performed.
     * @param index         the query type specific index. When the query type is {@code VK_QUERY_TYPE_TRANSFORM_FEEDBACK_STREAM_EXT} the index represents the vertex stream.
     */
    public static void vkCmdBeginQueryIndexedEXT(VkCommandBuffer commandBuffer, @NativeType("VkQueryPool") long queryPool, @NativeType("uint32_t") int query, @NativeType("VkQueryControlFlags") int flags, @NativeType("uint32_t") int index) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBeginQueryIndexedEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJV(__functionAddress, commandBuffer.address(), queryPool, query, flags, index);
    }

    // --- [ vkCmdEndQueryIndexedEXT ] ---

    /**
     * Ends a query.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To end an indexed query after the set of desired draw or dispatch commands is recorded, call:</p>
     * 
     * <pre><code>
     * void vkCmdEndQueryIndexedEXT(
     *     VkCommandBuffer                             commandBuffer,
     *     VkQueryPool                                 queryPool,
     *     uint32_t                                    query,
     *     uint32_t                                    index);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>The {@code vkCmdEndQueryIndexedEXT} command operates the same as the {@link VK10#vkCmdEndQuery CmdEndQuery} command, except that it also accepts a query type specific {@code index} parameter.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>All queries used by the command <b>must</b> be <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#queries-operation-active">active</a></li>
     * <li>{@code query} <b>must</b> be less than the number of queries in {@code queryPool}</li>
     * <li>{@code commandBuffer} <b>must</b> not be a protected command buffer</li>
     * <li>If {@code vkCmdEndQuery} is called within a render pass instance, the sum of {@code query} and the number of bits set in the current subpass&#8217;s view mask <b>must</b> be less than or equal to the number of queries in {@code queryPool}</li>
     * <li>If the {@code queryType} used to create {@code queryPool} was {@link #VK_QUERY_TYPE_TRANSFORM_FEEDBACK_STREAM_EXT QUERY_TYPE_TRANSFORM_FEEDBACK_STREAM_EXT} the {@code index} parameter <b>must</b> be less than {@link VkPhysicalDeviceTransformFeedbackPropertiesEXT}{@code ::maxTransformFeedbackStreams}</li>
     * <li>If the {@code queryType} used to create {@code queryPool} was not {@link #VK_QUERY_TYPE_TRANSFORM_FEEDBACK_STREAM_EXT QUERY_TYPE_TRANSFORM_FEEDBACK_STREAM_EXT} the {@code index} <b>must</b> be zero</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code queryPool} <b>must</b> be a valid {@code VkQueryPool} handle</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
     * <li>Both of {@code commandBuffer}, and {@code queryPool} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
     * </ul>
     * 
     * <h5>Host Synchronization</h5>
     * 
     * <ul>
     * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
     * <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
     * </ul>
     * 
     * <h5>Command Properties</h5>
     * 
     * <table class="lwjgl">
     * <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics Compute</td><td></td></tr></tbody>
     * </table>
     *
     * @param commandBuffer the command buffer into which this command will be recorded.
     * @param queryPool     the query pool that is managing the results of the query.
     * @param query         the query index within the query pool where the result is stored.
     * @param index         the query type specific index.
     */
    public static void vkCmdEndQueryIndexedEXT(VkCommandBuffer commandBuffer, @NativeType("VkQueryPool") long queryPool, @NativeType("uint32_t") int query, @NativeType("uint32_t") int index) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdEndQueryIndexedEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJV(__functionAddress, commandBuffer.address(), queryPool, query, index);
    }

    // --- [ vkCmdDrawIndirectByteCountEXT ] ---

    /**
     * Draw primitives where the vertex count is derived from the counter byte value in the counter buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To record a non-indexed draw call, where the vertex count is based on a byte count read from a buffer and the passed in vertex stride parameter, call:</p>
     * 
     * <pre><code>
     * void vkCmdDrawIndirectByteCountEXT(
     *     VkCommandBuffer                             commandBuffer,
     *     uint32_t                                    instanceCount,
     *     uint32_t                                    firstInstance,
     *     VkBuffer                                    counterBuffer,
     *     VkDeviceSize                                counterBufferOffset,
     *     uint32_t                                    counterOffset,
     *     uint32_t                                    vertexStride);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>When the command is executed, primitives are assembled in the same way as done with {@link VK10#vkCmdDraw CmdDraw} except the {@code vertexCount} is calculated based on the byte count read from {@code counterBuffer} at offset {@code counterBufferOffset}. The assembled primitives execute the bound graphics pipeline.</p>
     * 
     * <p>The effective {@code vertexCount} is calculated as follows:</p>
     * 
     * <pre><code>
     * const uint32_t * counterBufferPtr = (const uint8_t *)counterBuffer.address + counterBufferOffset;
     * vertexCount = floor(max(0, (*counterBufferPtr - counterOffset)) / vertexStride);</code></pre>
     * 
     * <p>The effective {@code firstVertex} is zero.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>{@link VkPhysicalDeviceTransformFeedbackFeaturesEXT}{@code ::transformFeedback} <b>must</b> be enabled</li>
     * <li>The implementation <b>must</b> support {@link VkPhysicalDeviceTransformFeedbackPropertiesEXT}{@code ::transformFeedbackDraw}</li>
     * <li>{@code vertexStride} must be less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxVertexInputBindingStride}</li>
     * <li>{@code counterBuffer} <b>must</b> have been created with the {@link VK10#VK_BUFFER_USAGE_INDIRECT_BUFFER_BIT BUFFER_USAGE_INDIRECT_BUFFER_BIT} bit set</li>
     * <li>The current render pass <b>must</b> be <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#renderpass-compatibility">compatible</a> with the {@code renderPass} member of the {@link VkGraphicsPipelineCreateInfo} structure specified when creating the {@code VkPipeline} bound to {@link VK10#VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS}</li>
     * <li>The subpass index of the current render pass <b>must</b> be equal to the {@code subpass} member of the {@link VkGraphicsPipelineCreateInfo} structure specified when creating the {@code VkPipeline} bound to {@link VK10#VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS}</li>
     * <li>For each set <em>n</em> that is statically used by the {@code VkPipeline} bound to {@link VK10#VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS}, a descriptor set <b>must</b> have been bound to <em>n</em> at {@link VK10#VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS}, with a {@code VkPipelineLayout} that is compatible for set <em>n</em>, with the {@code VkPipelineLayout} used to create the current {@code VkPipeline}, as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#descriptorsets-compatibility">the “Pipeline Layout Compatibility” section</a></li>
     * <li>For each push constant that is statically used by the {@code VkPipeline} bound to {@link VK10#VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS}, a push constant value <b>must</b> have been set for {@link VK10#VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS}, with a {@code VkPipelineLayout} that is compatible for push constants, with the {@code VkPipelineLayout} used to create the current {@code VkPipeline}, as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#descriptorsets-compatibility">the “Pipeline Layout Compatibility” section</a></li>
     * <li>Descriptors in each bound descriptor set, specified via {@code vkCmdBindDescriptorSets}, <b>must</b> be valid if they are statically used by the bound {@code VkPipeline} object, specified via {@code vkCmdBindPipeline}</li>
     * <li>All vertex input bindings accessed via vertex input variables declared in the vertex shader entry point&#8217;s interface <b>must</b> have valid buffers bound</li>
     * <li>For a given vertex buffer binding, any attribute data fetched <b>must</b> be entirely contained within the corresponding vertex buffer binding, as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#fxvertex-input">the “Vertex Input Description” section</a></li>
     * <li>A valid graphics pipeline <b>must</b> be bound to the current command buffer with {@link VK10#VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS}</li>
     * <li>If the {@code VkPipeline} object bound to {@link VK10#VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS} requires any dynamic state, that state <b>must</b> have been set on the current command buffer</li>
     * <li>Every input attachment used by the current subpass <b>must</b> be bound to the pipeline via a descriptor set</li>
     * <li>If any {@code VkSampler} object that is accessed from a shader by the {@code VkPipeline} bound to {@link VK10#VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS} uses unnormalized coordinates, it <b>must</b> not be used to sample from any {@code VkImage} with a {@code VkImageView} of the type {@link VK10#VK_IMAGE_VIEW_TYPE_3D IMAGE_VIEW_TYPE_3D}, {@link VK10#VK_IMAGE_VIEW_TYPE_CUBE IMAGE_VIEW_TYPE_CUBE}, {@link VK10#VK_IMAGE_VIEW_TYPE_1D_ARRAY IMAGE_VIEW_TYPE_1D_ARRAY}, {@link VK10#VK_IMAGE_VIEW_TYPE_2D_ARRAY IMAGE_VIEW_TYPE_2D_ARRAY} or {@link VK10#VK_IMAGE_VIEW_TYPE_CUBE_ARRAY IMAGE_VIEW_TYPE_CUBE_ARRAY}, in any shader stage</li>
     * <li>If any {@code VkSampler} object that is accessed from a shader by the {@code VkPipeline} bound to {@link VK10#VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS} uses unnormalized coordinates, it <b>must</b> not be used with any of the SPIR-V {@code OpImageSample*} or {@code OpImageSparseSample*} instructions with {@code ImplicitLod}, {@code Dref} or {@code Proj} in their name, in any shader stage</li>
     * <li>If any {@code VkSampler} object that is accessed from a shader by the {@code VkPipeline} bound to {@link VK10#VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS} uses unnormalized coordinates, it <b>must</b> not be used with any of the SPIR-V {@code OpImageSample*} or {@code OpImageSparseSample*} instructions that includes a LOD bias or any offset values, in any shader stage</li>
     * <li>Image subresources used as attachments in the current render pass <b>must</b> not be accessed in any way other than as an attachment by this command</li>
     * <li>If a {@code VkImageView} is sampled with {@link VK10#VK_FILTER_LINEAR FILTER_LINEAR} as a result of this command, then the image view&#8217;s <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#resources-image-view-format-features">format features</a> <b>must</b> contain {@link VK10#VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT}</li>
     * <li>If a {@code VkImageView} is sampled with {@link IMGFilterCubic#VK_FILTER_CUBIC_IMG FILTER_CUBIC_IMG} as a result of this command, then the image view&#8217;s <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#resources-image-view-format-features">format features</a> <b>must</b> contain {@link IMGFilterCubic#VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_CUBIC_BIT_IMG FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_CUBIC_BIT_IMG}</li>
     * <li>Any {@code VkImageView} being sampled with {@link IMGFilterCubic#VK_FILTER_CUBIC_IMG FILTER_CUBIC_IMG} as a result of this command <b>must</b> not have a {@code VkImageViewType} of {@link VK10#VK_IMAGE_VIEW_TYPE_3D IMAGE_VIEW_TYPE_3D}, {@link VK10#VK_IMAGE_VIEW_TYPE_CUBE IMAGE_VIEW_TYPE_CUBE}, or {@link VK10#VK_IMAGE_VIEW_TYPE_CUBE_ARRAY IMAGE_VIEW_TYPE_CUBE_ARRAY}</li>
     * <li>If the draw is recorded in a render pass instance with multiview enabled, the maximum instance index <b>must</b> be less than or equal to {@link VkPhysicalDeviceMultiviewProperties}{@code ::maxMultiviewInstanceIndex}</li>
     * <li>If {@code commandBuffer} is an unprotected command buffer, and any pipeline stage in the {@code VkPipeline} object bound to {@link VK10#VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS} reads from or writes to any image or buffer, that image or buffer <b>must</b> not be a protected image or protected buffer</li>
     * <li>If {@code commandBuffer} is a protected command buffer, and any pipeline stage in the {@code VkPipeline} object bound to {@link VK10#VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS} writes to any image or buffer, that image or buffer <b>must</b> not be an unprotected image or unprotected buffer</li>
     * <li>If {@code commandBuffer} is a protected command buffer, and any pipeline stage other than the framebuffer-space pipeline stages in the {@code VkPipeline} object bound to {@link VK10#VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS} reads from or writes to any image or buffer, the image or buffer <b>must</b> not be a protected image or protected buffer</li>
     * <li>If the bound graphics pipeline was created with {@link VkPipelineSampleLocationsStateCreateInfoEXT}{@code ::sampleLocationsEnable} set to {@link VK10#VK_TRUE TRUE} and the current subpass has a depth/stencil attachment, then that attachment <b>must</b> have been created with the {@link EXTSampleLocations#VK_IMAGE_CREATE_SAMPLE_LOCATIONS_COMPATIBLE_DEPTH_BIT_EXT IMAGE_CREATE_SAMPLE_LOCATIONS_COMPATIBLE_DEPTH_BIT_EXT} bit set</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code counterBuffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
     * <li>This command <b>must</b> only be called inside of a render pass instance</li>
     * <li>Both of {@code commandBuffer}, and {@code counterBuffer} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
     * </ul>
     * 
     * <h5>Host Synchronization</h5>
     * 
     * <ul>
     * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
     * <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
     * </ul>
     * 
     * <h5>Command Properties</h5>
     * 
     * <table class="lwjgl">
     * <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Inside</td><td>Graphics</td><td>Graphics</td></tr></tbody>
     * </table>
     *
     * @param commandBuffer       the command buffer into which the command is recorded.
     * @param instanceCount       the number of instances to draw.
     * @param firstInstance       the instance ID of the first instance to draw.
     * @param counterBuffer       the buffer handle from where the byte count is read.
     * @param counterBufferOffset the offset into the buffer used to read the byte count, which is used to calculate the vertex count for this draw call.
     * @param counterOffset       subtracted from the byte count read from the {@code counterBuffer} at the {@code counterBufferOffset}
     * @param vertexStride        the stride in bytes between each element of the vertex data that is used to calculate the vertex count from the counter value. This value is typically the same value that was used in the graphics pipeline state when the transform feedback was captured as the {@code XfbStride}.
     */
    public static void vkCmdDrawIndirectByteCountEXT(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int instanceCount, @NativeType("uint32_t") int firstInstance, @NativeType("VkBuffer") long counterBuffer, @NativeType("VkDeviceSize") long counterBufferOffset, @NativeType("uint32_t") int counterOffset, @NativeType("uint32_t") int vertexStride) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdDrawIndirectByteCountEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJJV(__functionAddress, commandBuffer.address(), instanceCount, firstInstance, counterBuffer, counterBufferOffset, counterOffset, vertexStride);
    }

    /** Array version of: {@link #vkCmdBindTransformFeedbackBuffersEXT CmdBindTransformFeedbackBuffersEXT} */
    public static void vkCmdBindTransformFeedbackBuffersEXT(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int firstBinding, @NativeType("VkBuffer const *") long[] pBuffers, @NativeType("VkDeviceSize const *") long[] pOffsets, @Nullable @NativeType("VkDeviceSize const *") long[] pSizes) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBindTransformFeedbackBuffersEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(pOffsets, pBuffers.length);
            checkSafe(pSizes, pBuffers.length);
        }
        callPPPPV(__functionAddress, commandBuffer.address(), firstBinding, pBuffers.length, pBuffers, pOffsets, pSizes);
    }

    /** Array version of: {@link #vkCmdBeginTransformFeedbackEXT CmdBeginTransformFeedbackEXT} */
    public static void vkCmdBeginTransformFeedbackEXT(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int firstCounterBuffer, @Nullable @NativeType("VkBuffer const *") long[] pCounterBuffers, @Nullable @NativeType("VkDeviceSize const *") long[] pCounterBufferOffsets) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBeginTransformFeedbackEXT;
        if (CHECKS) {
            check(__functionAddress);
            checkSafe(pCounterBufferOffsets, lengthSafe(pCounterBuffers));
        }
        callPPPV(__functionAddress, commandBuffer.address(), firstCounterBuffer, lengthSafe(pCounterBuffers), pCounterBuffers, pCounterBufferOffsets);
    }

    /** Array version of: {@link #vkCmdEndTransformFeedbackEXT CmdEndTransformFeedbackEXT} */
    public static void vkCmdEndTransformFeedbackEXT(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int firstCounterBuffer, @Nullable @NativeType("VkBuffer const *") long[] pCounterBuffers, @Nullable @NativeType("VkDeviceSize const *") long[] pCounterBufferOffsets) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdEndTransformFeedbackEXT;
        if (CHECKS) {
            check(__functionAddress);
            checkSafe(pCounterBufferOffsets, lengthSafe(pCounterBuffers));
        }
        callPPPV(__functionAddress, commandBuffer.address(), firstCounterBuffer, lengthSafe(pCounterBuffers), pCounterBuffers, pCounterBufferOffsets);
    }

}