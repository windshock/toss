// entry=0x4f460

void H4f460(void)

{
  char *pcVar1;
  int iVar2;
  char *pcVar3;
  long in_x16;
  long unaff_x19;
  undefined8 unaff_x25;
  void *unaff_x26;
  char *unaff_x28;
  
  unaff_x28[in_x16 + ((-DAT_00275ca8 | 0x642804bbf97b14d4U) + (-DAT_00275ca8 & 0x642804bbf97b14d4U))
                     * 0x400] = '\0';
  iVar2 = (int)DAT_00275ca8;
  CallSupervisor(0);
  if (0xfffff000 < (-iVar2 | 0xf97b1470U) * 2 - (-iVar2 ^ 0xf97b1470U)) {
    *(undefined8 *)(unaff_x19 + 0x2b0) = unaff_x25;
    pcVar1 = unaff_x28;
    do {
      pcVar3 = pcVar1;
      pcVar1 = pcVar3 + 1;
    } while (*pcVar3 != '\0');
    pcVar1 = unaff_x28 +
             (int)(((uint)pcVar3 ^ -(int)unaff_x28) + ((uint)pcVar3 & -(int)unaff_x28) * 2);
    *pcVar1 = '%';
    pcVar1[1] = 's';
    pcVar1[2] = (-(char)DAT_00275ca8 ^ 0xd4U) + (-(char)DAT_00275ca8 & 0x54U) * '\x02';
    memset(unaff_x26,0,0x400);
    *(long *)(unaff_x19 + 0x128) = (long)unaff_x26 + 9;
                    /* WARNING: Could not recover jumptable at 0x0015db44. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR_LAB_00279358)();
    return;
  }
  (*(code *)(&PTR_FUN_0027c1e0)
            [(long)(int)((-iVar2 | 0xf97b14d4U) + (-iVar2 & 0xf97b14d4U)) * 300 +
             (long)(int)((-iVar2 | 0xf97b15c6U) * 2 - (-iVar2 ^ 0xf97b15c6U))])
            (1,(-DAT_00275ca8 | 0x642804bbf97b255cU) * 2 - (-DAT_00275ca8 ^ 0x642804bbf97b255cU),
             0x642804bbf98354d3 - (-DAT_00275ca8 ^ 0xffffffffffffffffU),
             0x642804bbf97b14d3 - (-DAT_00275ca8 ^ 0xffffffffffffffffU));
                    /* WARNING: Could not recover jumptable at 0x001497d4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_0027f698)();
  return;
}


