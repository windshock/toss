// entry=0x8df20

void H8df20(void)

{
  ulong uVar1;
  uint uVar2;
  long lVar3;
  long unaff_x19;
  undefined1 *unaff_x20;
  int *unaff_x21;
  long unaff_x29;
  
  uVar1 = (*(ulong *)(unaff_x19 + 0x48) | (ulong)(uint)(*unaff_x21 << 3)) +
          (*(ulong *)(unaff_x19 + 0x48) & (ulong)(uint)(*unaff_x21 << 3));
  *(ulong *)(unaff_x19 + 0x48) = uVar1;
  *(char *)(unaff_x19 + 0x3f) = (char)uVar1;
  *(char *)(unaff_x19 + 0x3e) = (char)(uVar1 >> 8);
  *(char *)(unaff_x19 + 0x3d) =
       (char)(uVar1 >> ((-DAT_002752c0 ^ 0x3c8dU) + (-DAT_002752c0 & 0x3c8dU) * 2 & 0x3f));
  *(char *)(unaff_x19 + 0x3c) = (char)(uVar1 >> 0x18);
  *(char *)(unaff_x19 + 0x3b) =
       (char)(uVar1 >> ((-DAT_002752c0 | 0x3c9dU) * 2 - (-DAT_002752c0 ^ 0x3c9dU) & 0x3f));
  *(char *)(unaff_x19 + 0x3a) = (char)(uVar1 >> 0x28);
  *(char *)(unaff_x19 + 0x39) = (char)(uVar1 >> 0x30);
  *(char *)(unaff_x19 + 0x38) =
       (char)(uVar1 >> ((-DAT_002752c0 | 0x3cb5U) * 2 - (-DAT_002752c0 ^ 0x3cb5U) & 0x3f));
  uVar2 = -(int)DAT_002752c0;
  (*(code *)(&PTR_FUN_0027c1e0)
            [(long)(int)(-0x5bb9c384 - (-(int)DAT_002752c0 ^ 0xffffffffU)) * 300 +
             (long)(int)((uVar2 | 0xa4463cdd) * 2 - (uVar2 ^ 0xa4463cdd))])(2);
  *unaff_x20 = (char)((uint)*(undefined4 *)(unaff_x19 + 0x50) >> 0x18);
  unaff_x20[4] = (char)((uint)*(undefined4 *)(unaff_x19 + 0x54) >> 0x18);
  unaff_x20[8] = (char)(*(uint *)(unaff_x19 + 0x58) >>
                       (ulong)((-(int)DAT_002752c0 | 0x3c95U) * 2 - (-(int)DAT_002752c0 ^ 0x3c95U) &
                              0x1f));
  unaff_x20[0xc] = (char)((uint)*(undefined4 *)(unaff_x19 + 0x5c) >> 0x18);
  unaff_x20[0x10] =
       (char)(*(uint *)(unaff_x19 + 0x60) >>
             (ulong)((-(int)DAT_002752c0 | 0x3c95U) + (-(int)DAT_002752c0 & 0x3c95U) & 0x1f));
  unaff_x20[(-DAT_002752c0 | 0xa4fe7ff1a4463c91U) + (-DAT_002752c0 & 0xa4fe7ff1a4463c91U)] =
       (char)((uint)*(undefined4 *)(unaff_x19 + 100) >> 0x18);
  unaff_x20[0x18] = (char)((uint)*(undefined4 *)(unaff_x19 + 0x68) >> 0x18);
  unaff_x20[0x1c] = (char)((uint)*(undefined4 *)(unaff_x19 + 0x6c) >> 0x18);
  unaff_x20[1] = (char)((uint)*(undefined4 *)(unaff_x19 + 0x50) >> 0x10);
  unaff_x20[5] = (char)((uint)*(undefined4 *)(unaff_x19 + 0x54) >> 0x10);
  unaff_x20[9] = (char)((uint)*(undefined4 *)(unaff_x19 + 0x58) >> 0x10);
  unaff_x20[(-DAT_002752c0 ^ 0xa4fe7ff1a4463c8aU) + (-DAT_002752c0 & 0xa4fe7ff1a4463c8aU) * 2] =
       (char)((uint)*(undefined4 *)(unaff_x19 + 0x5c) >> 0x10);
  unaff_x20[(-DAT_002752c0 | 0xa4fe7ff1a4463c8eU) + (-DAT_002752c0 & 0xa4fe7ff1a4463c8eU)] =
       (char)(*(uint *)(unaff_x19 + 0x60) >>
             (ulong)((-(int)DAT_002752c0 | 0x3c8dU) + (-(int)DAT_002752c0 & 0x3c8dU) & 0x1f));
  unaff_x20[(-DAT_002752c0 | 0xa4fe7ff1a4463c92U) * 2 - (-DAT_002752c0 ^ 0xa4fe7ff1a4463c92U)] =
       (char)((uint)*(undefined4 *)(unaff_x19 + 100) >> 0x10);
  unaff_x20[0x19] =
       (char)(*(uint *)(unaff_x19 + 0x68) >>
             (ulong)(0x3c8c - (-(int)DAT_002752c0 ^ 0xffffffffU) & 0x1f));
  unaff_x20[(-DAT_002752c0 | 0xa4fe7ff1a4463c9aU) * 2 - (-DAT_002752c0 ^ 0xa4fe7ff1a4463c9aU)] =
       (char)(*(uint *)(unaff_x19 + 0x6c) >>
             (ulong)(0x3c8c - (-(int)DAT_002752c0 ^ 0xffffffffU) & 0x1f));
  unaff_x20[(-DAT_002752c0 | 0xa4fe7ff1a4463c7fU) * 2 - (-DAT_002752c0 ^ 0xa4fe7ff1a4463c7fU)] =
       (char)((uint)*(undefined4 *)(unaff_x19 + 0x50) >> 8);
  unaff_x20[(-DAT_002752c0 ^ 0xa4fe7ff1a4463c83U) + (-DAT_002752c0 & 0xa4fe7ff1a4463c83U) * 2] =
       (char)((uint)*(undefined4 *)(unaff_x19 + 0x54) >> 8);
  unaff_x20[10] = (char)((uint)*(undefined4 *)(unaff_x19 + 0x58) >> 8);
  unaff_x20[-0x5b01800e5bb9c376 - (-DAT_002752c0 ^ 0xffffffffffffffffU)] =
       (char)(*(uint *)(unaff_x19 + 0x5c) >>
             (ulong)((-(int)DAT_002752c0 | 0x3c85U) * 2 - (-(int)DAT_002752c0 ^ 0x3c85U) & 0x1f));
  unaff_x20[0x12] = (char)((uint)*(undefined4 *)(unaff_x19 + 0x60) >> 8);
  unaff_x20[0x16] = (char)((uint)*(undefined4 *)(unaff_x19 + 100) >> 8);
  unaff_x20[0x1a] = (char)((uint)*(undefined4 *)(unaff_x19 + 0x68) >> 8);
  unaff_x20[0x1e] =
       (char)(*(uint *)(unaff_x19 + 0x6c) >>
             (ulong)((-(int)DAT_002752c0 | 0x3c85U) * 2 - (-(int)DAT_002752c0 ^ 0x3c85U) & 0x1f));
  unaff_x20[3] = (char)*(undefined4 *)(unaff_x19 + 0x50);
  unaff_x20[7] = (char)*(undefined4 *)(unaff_x19 + 0x54);
  unaff_x20[0xb] = (char)*(undefined4 *)(unaff_x19 + 0x58);
  unaff_x20[0xf] = (char)*(undefined4 *)(unaff_x19 + 0x5c);
  unaff_x20[0x13] = (char)*(undefined4 *)(unaff_x19 + 0x60);
  unaff_x20[0x17] = (char)*(undefined4 *)(unaff_x19 + 100);
  unaff_x20[(-DAT_002752c0 | 0xa4fe7ff1a4463c98U) + (-DAT_002752c0 & 0xa4fe7ff1a4463c98U)] =
       (char)*(undefined4 *)(unaff_x19 + 0x68);
  unaff_x20[0x1f] = (char)*(undefined4 *)(unaff_x19 + 0x6c);
  lVar3 = tpidr_el0;
  if (*(long *)(lVar3 + 0x28) == *(long *)(unaff_x29 + -0x28)) {
    return;
  }
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}


